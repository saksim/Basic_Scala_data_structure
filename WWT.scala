//自定义一个特质，其类型为泛化类型
sealed trait WWT[+A]
//定义一个case基类 
case class WL[A](value:A) extends WWT[A]
//定义另一个case基类
case class WB[A](left:WWT[A],right:WWT[A]) extends WWT[A]

//单例对象的实现
object WWT {
    //定义一个返回此类长度的函数：例树的节点总数
    def size[A](t:WWT[A]): Int = t match {
	    case WL(_) => 1
		case WB(l,r) => 1 + size(l) + size(r)
	}
	
	//定义一个返回此类最大值的函数：例树中的最大值
	def maximun[A](t:WWT[A]): Int = t match {
	    case WL(n) => n
		case WB(l,r) => maximun(l) max maximun(r)
	}
	/*
	//定义一个返回此类最大深度的函数：
	//例:树的深度
	//【从底层到现在所在层，
	//每一层都算为1，
	//每一次递归都自加一。
	//到达底层则加的为0】*/
	def depth[A](t:WWT[A]): Int = t match {
	    case WL(_) => 0
		case WB(l,r) => 1 + (depth(l) max depth(r))
	}
	
	//定义一个基于源类型数据返回新类型数据的函数:
	def map[A,B](xs: WWT[A])(f: A=>B): WWT[B] = xs match {
	    case WL(a) => WL(f(a))
		case WB(l,r) => WB(map(l)(f), map(r)(f))
	}
	
	//泛化所有已经存在或定义过的函数
	//泛化一：总调函数
	def fold[A,B](xs:WWT[A])(f: A =>B)(g:(B,B) => B): B = xs match {
	    case WL(a) => f(a)
		case WB(l,r) => WB(fold(l)(f)(g),fold(r)(f)(g))
	}
}
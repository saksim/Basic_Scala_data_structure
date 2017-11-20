/*函数作为变量*/
//隐式推断函数的返回值
val f = (i: Int) => { i % 2 == 0}

//若函数更复杂，或要显式声明函数字面量的返回类型
val f: (Int) => Boolean = i => { i % 2 ==0}
val f: Int => Boolean = i => { i % 2 ==0}

//第二种形式：接受两个INT参数
/*显式
val add = (x:Int, y:Int) => { x + y }
val add = (x:Int, y:Int) => x + y
*/
/*隐式
val add:(Int,Int) => Int = (x,y) => {x+y}
val add:(Int,Int) => Int = (x,y) => x+y
*/

//部分应用函数
val c = scala.math.cos _
val c = scala.math.cos(_)
//即：方法需要传入一个参数，但是暂时未传入
//类似例子
val p = scala.math.pow(_,_)

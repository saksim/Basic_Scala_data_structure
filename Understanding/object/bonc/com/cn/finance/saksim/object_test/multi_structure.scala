/* 使用apply是为了在实例化的时候不使用new进行创建
*多种参数个数的使用apply的例子
* */
package bonc.com.cn.finance.saksim.object_test
class multi_structure {
  var name = ""
  var age = 0

  def printx(): Unit = {
    println(s"您在贵服的用户名为：$name\n" + s"您账户的攻击力为：$age")
  }
}

object multi_structure {
  /*定义单参数的apply函数*/
  def apply(name: String): multi_structure = {
    var p = new multi_structure
    p.name = name
    p
  }
  /*定义多参数的apply函数*/
  def apply(name: String, age: Int): multi_structure = {
    var p = new multi_structure
    p.name = name
    p.age = age
    p
  }
}

object driver extends App {
  val x = multi_structure(s"少林寺扫地僧@天鹅萍").printx()
  val y = multi_structure(s"少林寺扫地僧@唯我独尊",4002).printx()
}
/*以上是对额外的apply方法提供多个不同的构造函数*/

/*
使用case类的方式：
会默认构造函数实现访问器和取值器！！
即：最好在默认构造器函数中定义所有的类参数，按需要为辅助构造函数创建apply方法
*/
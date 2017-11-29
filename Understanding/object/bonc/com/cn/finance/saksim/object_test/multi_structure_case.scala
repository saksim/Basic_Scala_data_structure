package bonc.com.cn.finance.saksim.object_test

case class multi_structure_case(var name: String, var age: Int)

object multi_structure_case {
  def apply() = new multi_structure_case("少林寺扫地僧",0)
  def apply(name:String) = new multi_structure_case(name,0)
}

object driverx extends App {
  val a = multi_structure_case()
  val b = multi_structure_case(s"少林寺碰瓷王")
  val c = multi_structure_case(s"少林寺碰瓷王@天下归一",5000)
  println(s"a:$a\nb:$b\nc:$c")
}
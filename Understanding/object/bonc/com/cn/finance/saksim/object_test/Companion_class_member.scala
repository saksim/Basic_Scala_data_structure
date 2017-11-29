package bonc.com.cn.finance.saksim.object_test
class Companion_class_member( var ptype: String) {
  private val secret = 2
  override def toString: String = s"PIZZA的大小是 " + ptype
}

object Companion_class_member {
  val TYPE_THIN = "thin"
  val TYPE_THICK = "thick"
  def getFoo = "Foo"
  def double(sec: Companion_class_member) = sec.secret * 2
  def main(args: Array[String]): Unit = {
    println(Companion_class_member.TYPE_THIN)
    println(Companion_class_member.getFoo)
//  val f = new Companion_class_member
//  println(Companion_class_member.double(f))
  }
}
/*
* (1) 在同一个文件中定义object和class，并赋予同样的名字
* (2) 在object内定义"静态"成员
* (3) 在class内定义非静态成员
* (4) 知道class及其伴生object能互相访问对方的私有成员很重要！
* 例：伴生object的静态方法double能够访问class的私有成员secret
* */
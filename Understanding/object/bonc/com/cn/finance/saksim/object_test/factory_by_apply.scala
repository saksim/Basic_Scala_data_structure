package bonc.com.cn.finance.saksim.object_test
/*目的：让子类声明哪种对象应该被创建，并保持对象创建在同一位置*/
/*
实现方式：使用apply方法，将工厂的决策算法放在apply内部
*/
trait factory_by_apply {
  def attack
}

object factory_by_apply {
  private class Hqm extends factory_by_apply {
    override def attack { println(s"恶狗！吃我dick！！！")}
  }

  private class Erg extends factory_by_apply {
    override def attack: Unit = {println(s"浩气老贼！吃俺老孙一棒")}
  }

  def apply(s: String): factory_by_apply = {
    if (s == "Hqm") new Hqm
    else new Erg
  }
}

object drivery extends App {
  val user1 = factory_by_apply("Hqm")
  user1.attack
  val user2 = factory_by_apply(s"少林寺扛把子")
  user2.attack
  val user3 = factory_by_apply("Erg")
  user3.attack
}
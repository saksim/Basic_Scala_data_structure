/*目标：调用无副作用的getter
* */

class Pizza1{
  /*实现做法：在定义getter/setter时，在方法名后去掉括号*/
  def size = 12
}

object no_side_effect_getter {
  def main(args: Array[String]): Unit = {
    val x = new Pizza1
    println(x.size)
  }
}

/*
* 目标：给方法的参数设置默认值，因此调用此方法时可以不传入参数
* */

//例一：
class connection {
//  成功
  def makeconnection (timeout: Int = 5000, protocol:String= "http"): Unit = {
    println("timeout = %d, protocol = %s".format(timeout,protocol))
  }

//  可以编译但是不能使用参数的默认值
  def mkconn(timeout: Int = 5000, protocol: String): Unit = {
    println("timeout = %d, protocol = %s".format(timeout,protocol))
  }
}
object func_default_value {
  def main(args: Array[String]): Unit = {
    val x = new connection
    x.makeconnection()
//  这里不能使用x.makeconnection而是使用……connection()
    x.mkconn(5000,"he")
//  x.mkconn("he")会报错
  }
}

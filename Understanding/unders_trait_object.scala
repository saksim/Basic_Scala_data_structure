//在创建对象时混入特质
//例子1：
class DavidBanner

trait Angry {
  println("you won't like me")
}

object Test extends App{
  val hulk = new DavidBanner with Angry
}

//例子2：
trait Debugger {
  def log(msg: String) {
    //do sth with msg
  }
}  

val child = new Child
val issueChild = new IssueChile with Debugger

//以上，issuechild的实例就可以使用log方法！
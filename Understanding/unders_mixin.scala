/*******************************/
//混入多个特质到类，实现鲁棒性的设计方案
//（1）实现一个简单的混入，只需要在特质中定义想要的方法，通过extends或者with混入特质
//定义特质
trait Tail{
  def wagTail {println("tail is wagging")}
  def stopTail {println("tail is stopped")}
}
//使用特质与类创建新类
abstract class Pet(var name: String) {
  def speak //抽象方法
  def ownerIsHome {println("excited")}
  def jumpForJoy {println("jumping for joy")}
}

class Dog(name: String) extends Pet(name) with Tail{
  def speak{println("woof~~~~~~~~")}
  override def ownerIsHome{
    wagTail
	speak
  }
}
//总结¤：DOG类继承自PET类，并混入了特质tail。因此可以使用Pet和Tail中的方法：
object Test extends App{
  val lyl = new Dog("lyl")
  lyl.ownerIsHome
  lyl.jumpForJoy
}
//总结¤：DOG类同时实现了PET类和特质TAIL中所继承的方法【JAVA做不到】

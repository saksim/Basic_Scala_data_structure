/*目的：控制调用方法所属的特征*/
/*类继承了多个特质，并且特质实现了同样的方法，在使用super调用父类方法时，不仅要
选择调用的方法，还可以选择要调用的特征
*/

//例一：
trait Human{
  def Hello = "the Human trait"
}

trait Mother extends Human {
  override def Hello = "Mother"
}

trait Father extends Human {
  override def Hello = "Father"
}

class Child extends Human with Mother with Father {
  def printSuper = super.Hello
  def printMother = super[Mother].Hello
  def printFather = super[Father].Hello
  def printHuman = super[Human].Hello
}

//例二：
trait Animal1 {
  def walk { println("Animal is fucking walking")}
}

class FourLeggedAnimal extends Animal1 {
  override def walk { println("I'm walking on all fours")}
}

class Dog1 extends FourLeggedAnimal with Animal1 {
  def walkThenRun: Unit ={
    super.walk
    super[FourLeggedAnimal].walk
    super[Animal1].walk
  }
}

object use_trait {
  def main(args: Array[String]): Unit = {
    //例一：
    val c = new Child
    println(s"c.printSuper = ${c.printSuper}")
    println(s"c.printMother = ${c.printMother}")
    println(s"c.printFather = ${c.printFather}")
    println(s"c.printHuman = ${c.printHuman}")

    //例二：
    val x = new Dog1
    x.walkThenRun
  }
}

/*
总结：一个类继承多个特质，且特质具有同名方法，
则通过：super[特质名称].方法名称 的方法来制定调用具体特质的方法
*/


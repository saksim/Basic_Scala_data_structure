/*
* 目标：链式编程，用于创建流畅式的编程风格
* 需要做:
* (1)若类可能被拓展，需要把this.type作为链式调用风格方法的返回值类型
* (2)如果类不会被拓展，则把this从链式调用方法中返回出来
*/
//例一：可能被拓展的类，其定义方式【返回类型为this.type】
class chain_1 {
  protected var nationality = ""
  protected var allname = ""

  def setnation(nation: String): this.type = {
    nationality = nation
    this
  }

  def setname(name: String): this.type = {
    allname = name
    this
  }
}
class chain_Employee extends chain_1 {
  protected var role = ""

  def setRole(role: String): this.type = {
    this.role = role
    this
  }

  override def toString = {
    "%s,%s,%s".format(nationality,allname,role)
  }
}

//例二：不拓展的类，其定义方式【返回类型为原类型】
class chain_2 {
  import scala.collection.mutable.ArrayBuffer

  private val toppings = ArrayBuffer[String]()
  private var age= 0
  private var name = ""

  def addtop(topping:String) = {
    toppings += topping
    this
  }

  def setage(age:Int) = {
    this.age = age
    this
  }

  def setname(name: String)= {
    this.name = name
    this
  }

  def print() {
    println(s"老子的年龄是：$age")
    println(s"老子的名字是：$name")
    println(s"toppings:$toppings")
  }
}

object chain_method {
  def main(args: Array[String]): Unit = {
    val employee = new chain_Employee
    employee.setnation("UK")
        .setname("WeiWeiHE")
        .setRole("Hadoop Developer")
      println(employee)

    val ww = new chain_2
    ww.setage(200)
      .setname("WeiWeiHE")
      .addtop("Recommendation System")
      .addtop("Prince_compony")
      .addtop("Post-loan prediction of Mini-Company")
      .print
  }
}

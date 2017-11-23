/*主构造函数的写法*/

/*由三部分组成：构造函数参数、类内部被调方法、类内部执行的语句和表达式*/
//example:
class Person(var firstName: String, var lastName: String) {
  println("the constructor begins")
  
  //一些类的领域
  private val HOME = System.getProperty("users.home")
  var age = 0
  
  //一些方法
  override def toString = s"$firstName $lastName is $age years old"
  def printHome { println(s"HOME = $HOME")}
  def printFullName1 {println(s"$firstName $lastName")}
  def printFullName2 {println(this)}
  
  printHome
  printFullName1
  printFullName2
  println("still in the constructor")
}
/*�����캯����д��*/

/*����������ɣ����캯�����������ڲ��������������ڲ�ִ�е����ͱ��ʽ*/
//example:
class Person(var firstName: String, var lastName: String) {
  println("the constructor begins")
  
  //һЩ�������
  private val HOME = System.getProperty("users.home")
  var age = 0
  
  //һЩ����
  override def toString = s"$firstName $lastName is $age years old"
  def printHome { println(s"HOME = $HOME")}
  def printFullName1 {println(s"$firstName $lastName")}
  def printFullName2 {println(this)}
  
  printHome
  printFullName1
  printFullName2
  println("still in the constructor")
}
/*���캯���ֶεĿɼ���*/
/*
var�ֶΣ� scalaΪ������getter��setter����
val�ֶΣ� scalaΪ������getter����
private�ֶΣ� scala��ֹ����getter��setter����
��var/val/private�ֶΣ� ��getter��setter����
*/

//����VAR�ֶ�
class Person(var name:String)
val p = new Person("HEWEIWEI")
//getter
p.name
//setter
p.name = "Sucker"

//����VAL�ֶ�
class Person(val name:String)
val p = new Person("WeiWeiHE")
//getter
p.name

//���ڷ�VAL��VAR�ֶ�
class Person(name:String)
val p = new Person("Saksim")
//p.name�ǲ��������

//PRIVATE
class Person(private var name:String) {def getName {println(name)}}
val p = new Person("WeiWeiHE")
p.name
//p.name�ǲ������
p.getName

//CASE��
case class Person(name:String)
val p = Person("Saksim")
p.name
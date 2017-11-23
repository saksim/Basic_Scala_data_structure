/*构造函数字段的可见性*/
/*
var字段： scala为其生成getter和setter方法
val字段： scala为其生成getter方法
private字段： scala防止生成getter和setter方法
无var/val/private字段： 无getter和setter方法
*/

//对于VAR字段
class Person(var name:String)
val p = new Person("HEWEIWEI")
//getter
p.name
//setter
p.name = "Sucker"

//对于VAL字段
class Person(val name:String)
val p = new Person("WeiWeiHE")
//getter
p.name

//对于非VAL非VAR字段
class Person(name:String)
val p = new Person("Saksim")
//p.name是不被允许的

//PRIVATE
class Person(private var name:String) {def getName {println(name)}}
val p = new Person("WeiWeiHE")
p.name
//p.name是不允许的
p.getName

//CASE类
case class Person(name:String)
val p = Person("Saksim")
p.name
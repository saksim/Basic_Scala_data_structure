/*允许特质混入到一个有给定签名的方法的类型*/

//例一：
//例子weiwei特质要求任何希望继承他的类，必须有一个core方法，
//且接受一个String参数，返回一个Boolean类型的值
trait weiwei {
  this: {def core(password: String): Boolean } =>
}

class Starship {
  //code here ....
}

class Enterprise extends Starship with weiwei {
  def core(password: String): Boolean = {
    if (password == "password") {
	  println("core")
	  true
    } else {
      false
    }
  }
}

//例二：
//特质可以要求希望继承它的类，包含多个方法。为了限定多个方法，在代码块中添加方法签名
trait weiwei {
  this: {
    def core(password: String): Boolean
	def startcore: Unit
  } =>
}

class Starship

class Enterprise extends Starship with weiwei {
  def core(password: String): Boolean = {
    if (password == "lylsg") {println("core");true} else false
  }
  def startcore {println("core started~")}
}
/*
* 调用方法时使用指定参数名：
* methodName(param1=value1, param2=value2,……)
* */

class Pizza {
  var size = 12
  var ptype = "Bacon"
  def update(size: Int,ptype: String) ={
    this.size = size
    this.ptype= ptype
  }
  override def toString= {
    "A %d inco %s pizza has been ordered.".format(size,ptype)
  }
}
object specific_method_name {
  def main(args: Array[String]): Unit = {
    val p = new Pizza
    p.update(size = 200,ptype = "FUCKING BIGGEST BACON")
    println(p)
  }
}
/*总结：
* toString是在这个实例被输出时的打印
* 指定参数名传入参数
* 提供参数则提供了更多可读性
*/
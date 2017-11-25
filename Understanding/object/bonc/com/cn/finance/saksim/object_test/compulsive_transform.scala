package bonc.com.cn.finance.saksim.object_test

import com.sun.org.apache.bcel.internal.util.ClassPath

/*
* 目标1：将一个类的实例强制转换为另一个类型
* 实现方式：使用asInstanceOf方法
*
* 目标2：得知scala自动分配给对象的类型
* 实现方式: 使用getClass方法
* */

class classname {
  /*对变参列表的返回*/
  def printclass(num: Any*) = {
    println("class: " + num.getClass)
  }

  /*对单独变量的类类型返回*/
  def printclass2(c: Any) = {println(c.getClass)}

  /*对每一个元素的类型返回*/
  def printclass3(numbers: Any*): Unit = {
    numbers.foreach(println)
  }
}
object compulsive_transform {
  def main(args: Array[String]): Unit = {
    val a = 10
//    val b = a.asInstanceOf[String]
    val b = a.asInstanceOf[Double]
    val c = a.asInstanceOf[Float]
    println(b,c)

    val x = new classname
    x.printclass(1,2,3,4)
    x.printclass("mother")
    x.printclass2("mother")
    x.printclass3(123,421,"WEiweiHE",0x124)
  }
}

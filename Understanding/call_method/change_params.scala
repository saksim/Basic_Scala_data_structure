/*
* 目标：方法参数被定义为接受一些参数
* 方法：参数类型后加一个*，则这个参数变成了变参
*/

class change_params{
  def printall(string:String*): Unit ={
    string.foreach(println)
  }
// 变参只能作为方法签名中的最后一个参数！！！
// 注释的方法是错误的。因为其违反了准则【变参只能在最后】
//  def printall_v2(string:String*, i: Int): Unit = {
//    string.foreach(println)
//  }
}

object change_params {
  def main(args: Array[String]): Unit = {
    val x= new change_params
    x.printall()
    x.printall("wh13624")
    x.printall("wh13624","Climate Change Science and Policy")

    /*使用_*适配一个序列，使其做诶变参传给一个方法*/
    val y = List("apple","banana","cherry")
    x.printall(y: _*) //将每个元素作为单独才参数传给printall
  }
}
/*
总结：
（1）变参只能在最后
（2）一个方法只有一个变参
*/
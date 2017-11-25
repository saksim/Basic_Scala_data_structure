/*
* 目标：从一个方法张得到多个返回值，却又不希望包装成一个类
* */
class mutli_return_value {
  def getStockInfo = {
    ("bonc",100.00,101.00)
  }
}

object mutli_return_value {
  def main(args: Array[String]): Unit = {
    val y = new mutli_return_value
    val (symbol,currentPrice,bidPrice) = y.getStockInfo
    val x = y.getStockInfo
    println(x._1,x._2,x._3)
  }
}
/*总结:
* 不想用类包装，但又向返回多个值。则适合用元组tuple进行处理
* tuple中的数值可以通过其位置访问：例如x._1;x._2等
* 虽然以上方式比较实用，但是若给每个变量命名，代码可读性更好
* */
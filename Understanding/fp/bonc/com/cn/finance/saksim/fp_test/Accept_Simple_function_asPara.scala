package bonc.com.cn.finance.saksim.fp_test
/*
* 目的：创建接受简单函数作为参数的方法
* 解决方案步骤：
* (1)定义方法，包括签名
* (2)定义满足签名的一个或多个函数
* (3)将函数作为参数传递给方法
* */

class Accept_Simple_function_asPara {
/*1)executeFunction方法，接受签名为callback的函数*/
  def executeFunction(callback: () => Unit): Unit = {
    callback()
  }
}

object driver extends App {
  /*2)定义一个满足签名的函数*/
  val say = () => {println("Hello")}
  val x = new Accept_Simple_function_asPara
  /*3)将函数作为参数传递给方法*/
  x.executeFunction(say)
}

/** * 注意：
(1)
callback没有任何特殊含义；
callback只是表达含义清晰；
callback只是方法参数名字；

(2)
传入的函数必须匹配函数签名

(3)
传入的必须是无参函数并且没有返回值【f:() => Unit】

(4)
定义函数作为方法参数的语法为：
parameterName: (parameterType(s)) => returnType
* */
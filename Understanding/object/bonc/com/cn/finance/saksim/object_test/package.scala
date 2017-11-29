/*
* 目标：在不应如类或者对象的前提下，让函数、字段和其他代码在包级别可用
* 实现方法：将共享的代码放在一个保重的包对象中
惯例约定：
（1）将代码放在package.scala的文件中
（2）再将文件放在想要共享的类的同级目录中。
	举例：若想让代码对com.heweiwei.myapp.model所有类可见
	则创建package.scala文件，并将其放置于com/heweiwei/myapp/model的目录里
	并删除model，再以model声明为包对象的名字
    package com.heweiwei.myapp
    package object model {
    }
*/

package bonc.com.cn.finance.saksim
package object object_test {
  val MAGIC_NUM = 42

  def echo(a: Any) {println(a)}

  object Margin extends Enumeration {
    type Margin= Value
    val TOP, BOTTOM, LEFT, RIGHT = Value
  }

  type MutableMap[K,V] = scala.collection.mutable.Map[K,V]
  val MutableMap = scala.collection.mutable.Map
}
/*如此，即可在包中其他类、特质、对象种直接访问代码*/
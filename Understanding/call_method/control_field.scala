//私有作用域
class control_field {
  private def iscontrol = true

  def docontrol(other:control_field): Unit = {
    if (other.iscontrol) {
      println(s"分手快乐")
    }
  }
}

//保护作用域:对子类可见,但是必须在同一个对象内。不能是不同对象体内
class Animal{
  protected def heartBeat {}
}
class Dog extends Animal {
  heartBeat
}


//包作用域：使得一个方法对包内所有成员可见【使用private 将方法标记为对当前包私有】
package com.bonc.com.cn.model {
  class Suck {
    private[model] def doX{}
    private def doY {}
  }

  class Fuck{
    val s = new Suck
    s.doX
//  s.doY 【因为DOX是对同一个包（该MODEL包）下的其他类可见，但是DOY则不能】
  }
}

//控制一个方法对不同包级别下类的可见性
package com.bonc.com.cn.saksim.model {
  class train {
    private[model] def doX{}
    private[saksim] def doY{}
    private[bonc] def doZ{}
  }
  //DOX是对model包下其他的类可见
  //DOY是对saksim包下其他的类可见
  //DOZ是对所有BONC包下的类可见
}
import com.bonc.com.cn.saksim.model._
package com.bonc.com.cn.view {
  class Bar{
    val f = new train
//  f.doX 无法使用
//  f.doY 无法使用
    f.doZ
  }
//即：B包与A包平级，但是B内定义的方法无法使用A包内的私有方法
}

/*
总结：
private[this] 对当前实例可见
private       对当前类的所有实例可见
protected     对当前类以及其子类的实例可见
private[model]对xxxxxxxx……._.model包下的所有类可见
无修饰符      公开方法
*/

object control_field {
  def main(args: Array[String]): Unit = {
    val x = new control_field
    x.docontrol(x)
  }
}

/***************************************************************/
//定义一个特征，并声明其含有的方法名称
trait BaseSoundPalyer{
    def play
	def close
	def pause
	def stop
	def resum
}

//(1)定义一个实现了特质的类，此类必须事先特质的所有的抽象方法：
class Mp3SoundPlayer extends BaseSoundPalyer{
    def play {
	    //exactly code here
	}
	
	def close {
	    //exactly code here
	}
	
	def pause{
	    //exactly code here
	}
	
	def stop {
	    //exactly code here
	}
	
	def resum {
	    //exactly code here
	}
}

//(2)类继承特质，却没实现抽象方法，则必须为抽象类
abstract class SimpleSoundPlayer extends BaseSoundPalyer{
    def play {...}
	def close {...}
}

//(3)其他场景中，特质可以继承另一个特质
trait Mp3SoundPlayer extends BaseSoundPalyer{
    def getBasicPlayer: BasicPlayer
	def getBasicController: BasicController
	def setGain(volumn: Double)
}

//总结：
//1)一个class继承一个特质用extends；
//2)一个class集成多个特质，第一个用extends,其余用with
//3)一个class继承一个class和一个特质，其继承类使用extends，特质用with

//EXAMPLE
//从54行到72行，是类与特质的混合使用，称特质被混入到目标类中
abstract class Animal{
  def sperk
}

trait WaggingTail {
  def startTail {println("tail started")}
  def stopTail {println("tail stopped")}
}

trait FourLeggedAnimal {
  def walk
  def run
}

class Dog extends Animal with WaggingTail with FourLeggedAnimal{
  def sperk{println("Dog says 'fucker'")}
  def walk {println("Dog is walking")}
  def run {println("Dog is running")}
}

/***************************************************************/

import java.io.IOException
import javax.sound.sampled.LineUnavailableException

/*
(1)使用@throws注释声明可能抛出的异常
(2)把注解放在方法声明的签名以声明该方法可能抛出异常
(3)如果一个方法抛出多个异常，则需要将异常都写出来
*/

class classification_throw {
  @throws (classOf[Exception])
  @throws (classOf[LineUnavailableException])
  @throws (classOf[IOException])
  @throws (classOf[IndexOutOfBoundsException])
  def play: Unit ={
    throw new Exception
  }
}

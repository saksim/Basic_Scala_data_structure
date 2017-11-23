/*�������캯��this*/
class Pizza(var Size:Int, var Type:String) {
  def this(Size: Int) {
    this(Size,Pizza.DEFAULT_TYPE)
  }
  
  def this(Type:String) {
    this(Pizza.DEFAULT_SIZE,Type)
  }
  
  def this() {
    this(Pizza.DEFAULT_SIZE,Pizza.DEFAULT_TYPE)
  }
  
  override def toString = s"A $Size inch pizza with a $Type ordered."
}

object Pizza {
  val DEFAULT_SIZE = 12
  val DEFAULT_TYPE = "BACON"
}

//实例化应用PIZZA
val p1 = new Pizza
val p2 = new Pizza(Pizza.DEFAULT_SIZE,Pizza.DEFAULT_TYPE)
val p3 = new Pizza(20)
val p4 = new Pizza("BARBICUE")

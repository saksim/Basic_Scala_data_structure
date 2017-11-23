object test {
  def main(args: Array[String]) : Unit = {
    //实例化应用PIZZA
    val p1 = new Pizza
    val p2 = new Pizza(Pizza.DEFAULT_SIZE,Pizza.DEFAULT_TYPE)
    val p3 = new Pizza(20)
    val p4 = new Pizza("BARBICUE")
    println(p1)
  }
}

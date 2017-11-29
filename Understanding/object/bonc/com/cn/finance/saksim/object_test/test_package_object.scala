package bonc.com.cn.finance.saksim.object_test

object test_package_object extends App {
  echo("SUCK MY DICK")
  echo(MAGIC_NUM)
  echo(Margin.LEFT)

  val mm = MutableMap("Name" -> "AI")
  mm += ("password" -> "123211215")

  for ((k,v) <- mm ) printf("key: %s, value: %s\n",k,v)
}

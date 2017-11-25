package bonc.com.cn.finance.saksim.object_test
/*
* 启动入口一：
* 在命令行模式/脚本模式/大&巨大的应用中【定义继承App特质的object。】
* 需要先用scalac编译；在用scala命令运行
*
* 启动入口二：
* 在object中手动实现一个拥有正确签名的main方法
*
*/

object binary_launch_app extends App {
  if (args.length == 1)
    println(s"欢迎主公${args(0)}来到剑网三世界。驲天驲地驲浩气，曹虎曹龙曹恶人。")
  else
    println(s"小贱民，你特码弄啥累？？？还玩游戏？滚去学习")
}

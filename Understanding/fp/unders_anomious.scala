//将匿名函数（函数字面量），作为参数传入一个把函数作为参数的方法中

//(1) 假设有List
val x = List.range(1,10)
//(2) 传入匿名函数，创建只有偶数的list
val evens= x.filter((i:Int)  => i % 2 == 0)
//总结：匿名函数为 (i:Int) => i % 2 ==0
//(3) 进一步简化
val evens = x.filter( _ % 2 == 0)

/*
总纲：
=>是一个转换器
左侧为参数列表
右侧为新的结果
*/

/*
简化过程：
x.foreach((i:Int) => println(i))
因为可推到类型，所以INT省略
x.foreach((i) => println(i))
因为只有一个参数，无需使用括号
x.foreach(i => println(i))
因为i在函数内只是用了一次，所以可以用下划线代替
x.foreach(println(_))
若一匿名函数只有一条语句，该语句只接受一个参数，那么参数无需制定，也无需显示声明
x.foreach(println)
*/
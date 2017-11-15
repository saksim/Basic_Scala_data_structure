/********************************/
//限定特质只可被应用于继承基类型的子类型
//要点：在特质的开头使用【this:子类型名称 => declaration】

trait CoreFeature {
  this: SubFeature => 
  //更多其它代码
}

//对于以上的使用
class SubFeature
class Enterprise extends SubFeature with CoreFeature

//注意：任何具体类混入特质时，一定要保证其类型和特质的自身类型一致

//例:17行到28行之间的代码是可以运行的，这是正确的使用方式
trait StarfleetWarpCore{
  this: Starship =>
  //更多代码
}

class Starship
trait WarpCoreEjector
trait FireExtinguisher
class Enterprise extends Starship
	with WarpCore
	with WarpCoreEjector
	with FireExtinguisher
//但是17到28行，若Enterprise不是继承Starship、WarpCoreEjector和fire……编译会失败。
//因为自身类型签名不正确
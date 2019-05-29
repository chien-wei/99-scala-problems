import scala.annotation.tailrec

object P09_pack extends App {
  def pack(list: List[Symbol]): List[List[Symbol]] = {
    list.foldLeft(List[List[Symbol]]()) {
      case (List(), x) => List(List(x))
      case (xs, x) if xs.last.last == x => xs.init:::List(xs.last:::List(x))
      case (xs, x) => xs:::List(List(x))
    }
  }

  def tailrecPack(list: List[Symbol]): List[List[Symbol]] = {
    @tailrec
    def packHelper(res: List[List[Symbol]], rem: List[Symbol]): List[List[Symbol]] =
      rem match {
        case Nil => res
        case x::xs if res.isEmpty || res.last.head != x => packHelper(res:::List(List(x)), xs)
        case x::xs => packHelper(res.init:::List(res.last:::List(x)), xs)
      }
    packHelper(List(), list)
  }

  println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  println(tailrecPack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}

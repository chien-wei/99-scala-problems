import scala.annotation.tailrec

object P07_flatten extends App {
  def flatten(list: List[Any]): List[Any] = {
    list match {
      case Nil => Nil
      case (x: List[_])::xs => flatten(x):::flatten(xs)
      case x::xs => x::flatten(xs)
    }
  }

  def tailrecFlatten(list: List[Any]): List[Any] = {
    @tailrec
    def flattenHelper(res: List[Any], rem: List[Any]): List[Any] = {
      rem match {
        case Nil => res
        case (x:List[_]) :: Nil => flattenHelper(res, x)
        case (x:List[_]) :: xs => flattenHelper(res:::x, xs)
        case x :: xs => flattenHelper(res:::List(x), xs)
      }
    }
    flattenHelper(List(), list)
  }
  println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  println(tailrecFlatten(List(List(1, 1), 2, List(3, List(5, 8)))))
}

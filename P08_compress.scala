object P08_compress extends App {
  def compress(list: List[Symbol]): List[Symbol] = list match {
    case List(x) => List(x)
    case x :: xs if x == xs.head => compress(xs)
    case x :: xs => x::compress(xs)
  }

  def compressFold(list: List[Symbol]): List[Symbol] =
    list.foldLeft(List[Symbol]()) {
      case (List(), x) => List(x)
      case (xs, x) if xs.last == x => xs
      case (xs, x) => xs:::List(x)
    }

  println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  println(compressFold(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}

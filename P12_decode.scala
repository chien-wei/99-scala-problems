object P12_decode extends App {
  def decode(code: List[(Int, Symbol)]): List[Symbol] = {
    code.foldLeft(List[Symbol]()) {
      case (xs, x) => xs:::List.fill(x._1)(x._2)
    }
  }

  def flatMapDecode(code: List[(Int, Symbol)]): List[Symbol] = {
    code.flatMap( x => List.fill(x._1)(x._2))
  }

  println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  println(flatMapDecode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
}

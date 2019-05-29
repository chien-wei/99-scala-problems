object P14_duplicate extends App {
  def duplicate(list: List[Symbol]): List[Symbol] = {
    list.foldLeft(List[Symbol]()) {
      case (xs, x) => xs:::List(x, x)
    }
  }

  def duplicate2(list: List[Symbol]): List[Symbol] = list.flatMap(x => List(x, x))

  println(duplicate(List('a, 'b, 'c, 'c, 'd)))
  println(duplicate2(List('a, 'b, 'c, 'c, 'd)))
}

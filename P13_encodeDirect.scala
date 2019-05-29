
object P13_encodeDirect extends App {
  def encodeDirect(list: List[Symbol]): List[(Int, Symbol)] = {
    list.foldLeft(List[(Int, Symbol)]()) {
      case (List(), x) => List((1, x))
      case (xs, x) if xs.last._2 == x => xs.init:::List((xs.last._1 + 1, xs.last._2))
      case (xs, x) => xs:::List((1, x))
    }
  }

  def spanEncodeDirect(list: List[Symbol]): List[(Int, Symbol)] = {
    if (list.isEmpty) Nil
    else {
      val (packed, next) = list span { _ == list.head }
      (packed.length, packed.head)::spanEncodeDirect(next)
    }
  }

  println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  println(spanEncodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}

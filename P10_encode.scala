import P09_pack.pack

object P10_encode extends App {
  def encode(list: List[Symbol]): List[(Int, Symbol)] =
    pack(list).map(x => (x.size, x.head))

  println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}

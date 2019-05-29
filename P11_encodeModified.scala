import P10_encode.encode

object P11_encodeModified extends App {
  def encodeModified(list: List[Symbol]): List[Any] = {
    encode(list).map(x => if (x._1 == 1) x._2 else x)
  }

  println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
}

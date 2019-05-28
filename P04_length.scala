object P04_length extends App {
  def length[A](list: List[A]): Int = {
    list.size
  }

  val list = List(1, 1, 2, 3, 5, 8)
  println(length(list))
}


object P05_reverse extends App {
  def reverse[A](list: List[A]): List[A] = {
    list.reverse
  }

  val list = List(1, 1, 2, 3, 5, 8)
  println(reverse(list))
}


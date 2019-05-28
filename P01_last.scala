object P01_last extends App {
  def last[A](list: List[A]): A = {
    list.last
  }

  val list = List(1, 1, 2, 3, 5, 8)
  println(last(list))
}
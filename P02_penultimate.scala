object P02_penultimate extends App {
  def penultimate[A](list: List[A]): A = {
    list.init.last
  }

  val list = List(1, 1, 2, 3, 5, 8)
  println(penultimate(list))
}


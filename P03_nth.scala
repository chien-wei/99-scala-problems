import scala.annotation.tailrec

object P03_nth extends App {
  @tailrec
  def nth[A](n: Int, list: List[A]): A = {
    if (n == 0) list.head
    else if (n > 0) nth(n-1, list.tail)
    else throw new NoSuchElementException
  }


  val list = List(1, 1, 2, 3, 5, 8)
  println(nth(2, list))
}


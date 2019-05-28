object P06_isPalindrome extends App {
  def isPalindrome[A](list: List[A]): Boolean = {
    list.reverse == list
  }

  val list = List(1, 1, 2, 3, 5, 8)
  println(isPalindrome(list))
  println(isPalindrome(List(1, 2, 3, 2, 1)))
}


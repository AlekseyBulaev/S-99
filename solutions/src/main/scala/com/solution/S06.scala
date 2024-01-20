package com.solution

import scala.annotation.tailrec

//Find out whether a list is a palindrome

object S06 {
  def isPalindrome[A](in: List[A]): Boolean = {
    @tailrec
    def inner(index: Int, reversed: List[A], tail: List[A]): Boolean = index match {
      case 0 if reversed.length == tail.length => reversed == tail
      case 0 => reversed == tail.tail
      case _ => inner(index - 1,  List(tail.head) ++ reversed, tail.tail)
    }
    inner(in.length/2, Nil, in)
  }
}

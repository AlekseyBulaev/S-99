package com.solution

import scala.annotation.tailrec

/*
Eliminate consecutive duplicates of list elements

If a list contains repeated elements they should be replaced with
a single copy of the element. The order of the elements should not be changed.
*/
object S08 {

  def compress[A](ls: List[A]): List[A] = {
    @tailrec
    def inner(element: A, tail: List[A], result: List[A]): List[A] = tail match {
      case List(el) => result ++ List(el)
      case List(h, _*) if element.equals(h) => inner(tail.head, tail.tail, result)
      case _ => inner(tail.head, tail.tail, result ++ List(element))
    }

    inner(ls.head, ls.tail, List())
  }
}

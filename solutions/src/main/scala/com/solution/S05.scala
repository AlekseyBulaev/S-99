package com.solution



//Reverse a list.

object S05 {
  def reverse[A](in: List[A]): List[A] = in match {
    case  Nil => Nil
    case head :: last => reverse(last) ++ List(head)
  }

  def reverseFunctional[A](ls: List[A]): List[A] =
    ls.foldLeft(List[A]()) { (r, h) => h :: r }
}

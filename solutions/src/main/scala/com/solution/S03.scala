package com.solution

import scala.annotation.tailrec

//Find the Kth element of a list.

object S03 {
  @tailrec
  def nth[A](index: Int, in: Seq[A]): A = in match {
    case head :: _ if index == 0 => head
    case _ if index >=0 => nth(index-1, in.tail)
    case _ => throw new NoSuchElementException
  }
}

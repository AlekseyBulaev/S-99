package com.solution

import scala.annotation.tailrec

//Find the last but one element of a list.

object S02 {
  @tailrec
  def penultimate[A](in: Seq[A]): A = in match {
    case elm :: _ :: Nil => elm
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
}

package com.solution

import scala.annotation.tailrec

//Find the last element of a list

object S01 {
  @tailrec
  def last[A](in: Seq[A]): A = in match {
    case elm :: Nil => elm
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
}

package com.solution

import scala.annotation.tailrec

//Find the number of elements of a list.

object S04 {
  def length[A](in: Seq[A]): Int = {
    @tailrec
    def length(acc: Int, in: Seq[A]): Int = in match {
      case Nil => acc
      case _ :: tail => length(acc+1, tail)
    }
    length(0, in)
  }
}

package com.solution

import scala.annotation.tailrec

//Flatten a nested list structure.

object S07 {
  def flatten[A](in: List[A]): List[Any] = {
    def inner(input: List[Any], result: List[Any]): List[Any] = input match {
      case inp @ List(List(h, _*), _*) => inner(inp.head.asInstanceOf[List[Any]], result) ++ inner(inp.tail, List())
      case Nil => result
      case _ => inner(input.tail, result ++ List(input.head))
    }
    inner(in, List())
  }
}

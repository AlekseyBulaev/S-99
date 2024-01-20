package com.solution

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class S05Spec extends AnyWordSpecLike with Matchers {
  " Reverse a list" should {
    "work" in {
      S05.reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)
      S05.reverse(List(1, 1)) shouldBe List(1, 1)
    }
  }
}

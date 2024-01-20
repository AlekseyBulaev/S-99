package com.solution

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class S04Spec extends AnyWordSpecLike with Matchers {
  "Find the number of elements of a list" should {
    "work" in {
      S04.length(List(1, 1, 2, 3, 5, 8)) shouldBe 6
    }
  }
}

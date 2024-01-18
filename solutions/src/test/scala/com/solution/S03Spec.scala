package com.solution

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class S03Spec extends AnyWordSpecLike with Matchers {
  "Find the Kth element of a list" should {
    "work" in {
      S03.nth(2, List(1, 1, 2, 3, 5, 8)) shouldBe 2
      S03.nth(0, List(1, 1, 2, 3, 5, 8)) shouldBe 1
      S03.nth(1, List(1, 1, 2, 3, 5, 8)) shouldBe 1
      S03.nth(5, List(1, 1, 2, 3, 5, 8)) shouldBe 8
    }
  }
}

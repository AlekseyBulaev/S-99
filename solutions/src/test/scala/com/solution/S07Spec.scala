package com.solution

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class S07Spec extends AnyWordSpecLike with Matchers {
  "Flatten a nested list structure" should {
    "work" in {
      S07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) shouldBe List(1, 1, 2, 3, 5, 8)
    }
  }
}

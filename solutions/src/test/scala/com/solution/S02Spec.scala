package com.solution

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class S02Spec extends AnyWordSpecLike with Matchers {
  "Find the last but one element of a list" should {
    "work" in {
      S02.penultimate(List(1, 1, 2, 3, 5, 8)) shouldBe 5
    }
  }
}

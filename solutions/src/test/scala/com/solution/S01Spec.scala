package com.solution

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike
class S01Spec  extends AnyWordSpecLike with Matchers  {
  "Find the last element of a list" should {
    "work" in {
      S01.last(List(1, 1, 2, 3, 5, 8)) shouldBe 8
    }
  }
}

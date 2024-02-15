package com.solution

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class S08Spec extends AnyWordSpecLike with Matchers {
  "Eliminate consecutive duplicates of list elements" should {
    "work" in {
      S08.compress(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")) shouldBe List("a", "b", "c", "a", "d", "e")
    }
  }
}

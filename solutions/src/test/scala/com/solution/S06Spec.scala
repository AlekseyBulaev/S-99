package com.solution

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class S06Spec extends AnyWordSpecLike with Matchers {
  "Find out whether a list is a palindrome" should {
    "work" in {
      S06.isPalindrome(List(1, 2, 3, 2, 1)) shouldBe true
    }
  }
}

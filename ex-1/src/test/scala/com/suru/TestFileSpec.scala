package com.suru

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers

class TestFileSpec extends AnyFreeSpec with Matchers {

  "Test getTestVal" in {
    TestFile.getTestVal mustBe "Hello World!"
  }
}

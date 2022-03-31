package com.suru

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class TestFileSpec extends AnyFreeSpec with Matchers {

  "Test getTestVal" in {
    TestFile.getTestVal shouldBe "Hello World!"
  }
}

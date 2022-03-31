package com.suru

import com.suru.enums.Color

object EnumExamples extends App {
  val c = Color.valueOf("Blue")
  println(c.ordinal)
  println(c.rgb)
}

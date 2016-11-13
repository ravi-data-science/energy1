package com.core.rootz

/**
  * Created by ravikiran on 11/6/2016.
  */
object Fn_Multi_Curry extends App {

  // Multi-argument functions:
  def h(x : Int, y : Int) : Int = x + y

  // A Curried multi-argument function:
  def hC (x : Int) (y : Int) : Int = x + y

  // Wrong: hC 3 4
  // Right: hC (3) (4)

  // Wrong: hC (3)
  // Right: hC (3) _

  // Wrong: hC _ (4)
  // Right: hC (_:Int) (4)

  val plus3 = hC (_:Int) (3)
  val plus_3 = hC (3) _

  println(plus3(10))
  // Prints:
  // 13

  println(plus_3(5))
//8
}

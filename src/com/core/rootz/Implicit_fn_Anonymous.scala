package com.core.rootz

/**
  * Created by ravikiran on 11/6/2016.
  */
object Implicit_fn_Anonymous extends App {


  /*
  // Functions:
  def incImplicit(x : Int ) = x + 1

  val incAnonymous = ((x : Int) => x + 1)
  */

  // Implicit function:
  def id(x : Int) : Int = x

  println(id(3))
  // Prints:
  // 3


  // Anonymous function:
  val anonId = (x : Int) => x


  println(anonId(3))
  // Prints:
  // 3


}

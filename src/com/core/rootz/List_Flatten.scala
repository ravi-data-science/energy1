package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object List_Flatten extends App{

  val lst = List(List(1, 2), List(3), List(), List(4, 5)).flatten
println(lst)

  val ctry=List("america","india")
  val chr=ctry.map(_.toCharArray).flatten
  println(chr)
}

package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object List_Concatenation extends App{

  val l1 =List(1,2,3)
  val l2=List(3,4,5)
  val l3=l1:::l2

  println(l3)
  println(l3:::Nil)

  println(List():::l3)
  println(List(1,2,3):::List(4))
}

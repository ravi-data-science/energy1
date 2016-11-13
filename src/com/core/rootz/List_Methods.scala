package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object List_Methods extends App{

  val country= "america" :: ("india" :: ("china" :: Nil))

  val country_1 = List("america","india","china")
  println(country.head)
  println(country.tail)
  println(country.tail.head)

}

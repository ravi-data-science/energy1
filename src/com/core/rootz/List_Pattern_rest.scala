package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object List_Pattern_rest extends App {

  val lst=List("america","india","china")

  val a :: b :: rest= lst
  //matches lists of length 2 or greater

//  a: String = america
  // b: String = india
  // rest: List[String] = List(china)

}

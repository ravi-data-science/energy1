package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object List_TakeDropSplitAt extends App{

  val v1=List(1,2,3)
  println(v1.take(1))
  println(v1 take(10))

  println(v1.drop(1))

  println(v1.splitAt(1))

}

package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object List_mkstring extends App{

  val lst=List(1,2,3)
  println(lst.mkString("##","*","&&"))

  println(lst mkString "#")

  println(lst mkString)
}

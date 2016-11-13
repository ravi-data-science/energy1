package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object List_StringBuilder extends App{

  val lst=List("america","india")
  val buf = new StringBuilder
  println(lst addString (buf, "(", ";", ")"))
  //stringbuilder object

}

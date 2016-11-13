package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object  List_Array extends App{

  val v1=List(1,2)
  val v3=v1.toArray

  val v2=Array(3,4)
  println(v2)
  println(v2.mkString("<", ",", ">"))
  v2.foreach(println)

  val v4=v2.toList

  println(v3)
  println(v4)

  val v5=List('a','b')
  println(v5.toArray)


  val v6=new Array[Int](10)
  val v7= v1.copyToArray(v6, 1)
  println(v6)
  println(v7)

}

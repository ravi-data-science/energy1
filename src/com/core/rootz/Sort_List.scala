package com.core.rootz

/**
  * Created by ravikiran on 11/4/2016.
  */
object Sort_List extends App {

  val lstInt:List[Int]=List(1,5,7,3,5,7)

  def isort(xs: List[Int]): List[Int] = if (xs.isEmpty) Nil else insert(xs.head, isort(xs.tail))
  def insert(x: Int, xs: List[Int]): List[Int] = if (xs.isEmpty || x <= xs.head) x :: xs else xs.head :: insert(x, xs.tail)

println(isort(lstInt))


}

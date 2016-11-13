package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object Lists_Pattern_InsertionSort extends App{

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insert(x, isort(xs1))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match
  { case List() => List(x)
    case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
  }

  val lstInt:List[Int]=List(1,5,7,3,5,7)

  println(isort(lstInt))
}

package com.core.rootz

/**
  * Created by ravikiran on 11/4/2016.
  */
object Lists_Operations extends App {


  val v1: List[Int] = List(1, 2, 3)
  val v1_1: List[Int] = 1 :: (2 :: (3 :: Nil))

  val v1_2: List[Int] = 1 :: 2 :: 3 :: Nil


  println(v1)
  println(v1_1)
  println(v1_2)


  val lstNothing: List[Nothing] = List()
  val lstString: List[String] = List()
  val empty = Nil
  println(empty)

  val empty_1:List[Nothing]=Nil
  println(empty_1)

  val lstNested: List[List[Int]] = List(List(1, 2, 3), List(4, 5, 6))
  println(lstNested)

  val lstNested_1: List[List[Int]] = (1 :: (2 :: (3 :: Nil))) ::
    (4 :: (5 :: List(6))) :: Nil

  println(lstNested_1)

  val lstNested_2: List[List[Int]] = (1 :: (2 :: (3 :: Nil))) ::
    (4 :: (5 :: (6 :: Nil))) :: Nil

  println(lstNested_2)
}


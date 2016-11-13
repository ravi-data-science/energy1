package com.core.rootz

/**
  * Created by ravikiran on 11/6/2016.
  */
object ScalaSnippets  extends App{

  //Find the last element of a list.
  println(List(1, 1, 2, 3, 5, 8).last)

  //Find the last but one element of a list.
  //println(List(1, 1, 2, 3, 5, 8).penultimate)


  // Floating point:
  val aDouble = 4.0
  // Charaters:
  val aCharacter = 'c'

  // Strings:
  val aString = "Google"

  // Symbols:
  val aSymbol = 'foo
  println("asymbol:"+aSymbol)

  // XML:
  val anXMLElement = <a href="http://www.google.com/">{aString}</a>
println("xml:"+anXMLElement)


  val aRange = 1 to 5
  println(aRange)

  // Tuples:
  val aPair = (aString,aDouble)
  println(aPair)

  // Maps:
  val aMap = Map(3 -> "foo", 4 -> "bar")

println(aMap)

  // Sets: (can sets be declared with duplicate elements??)
  val aSet = Set(8,9,10,10)

  println(aSet) // gives only 8,9,10
  // Arrays:

  val arr=Array(1,2,3)
  println(arr)

  // Unit:
  val unit=()
  println(unit)

  // Null:
  val nullval=null
  println(nullval)


}



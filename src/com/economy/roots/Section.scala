package com.economy.roots

/**
  * Created by ravikiran on 9/24/2016.
  */
class Section {

def main(args:Array[String]): Unit = {
  println("in main:"+args)
}

}

object UnifiedTypes extends App {
  val set = new scala.collection.mutable.LinkedHashSet[Any]
  set += "This is a string"  // add a string
  set += 732                 // add a number
  set += 'c'                 // add a character
  set += true                // add a boolean value
  set += main _              // add the main function
  val iter: Iterator[Any] = set.iterator
  while (iter.hasNext) {
    println(iter.next.toString())
  }
}
package com.core.rootz

/**
  * Created by ravikiran on 11/5/2016.
  */
object List_Zip_Unzip extends App {

//  If the two lists are of different length, any unmatched elements are dropped:

  val lst=List('a','b','c')

  val lstzip=lst.indices zip lst
  println(lstzip)
  //scala.collection.immutable.IndexedSeq[(Int, Char)]

  val lstindex=lst.zipWithIndex
  println(lstindex)
// List[(Char, Int)]

  println(lstindex.unzip)
}

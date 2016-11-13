package com.core.rootz

/**
  * Created by ravikiran on 11/6/2016.
  */
object Lazy_fields_argless_func extends App{

  // Lazy fields are argless functions that cache their result:
  class LazyClass {
    lazy val x = { println("Evaluating x") ; 3 }
  }

  val lc = new LazyClass
  println(lc.x)
  println(lc.x)
  println(lc.x)
  // Prints:
  // Evaluating x
  // 3
  // 3
  // 3

  // Parameters can be evaluated lazily by-name:
  def lazyId(x : => Int) : Int = {
    x
    x
    x
    return x ;
  }

  println(lazyId { println("used!") ; 3 })
  // Prints:
  // used!
  // used!
  // used!
  // used!
  // 3

}

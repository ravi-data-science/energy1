package com.core.rootz

/**
  * Created by ravikiran on 11/6/2016.
  */
object  Class_apply extends App {


  // class with apply method:
  class Identity {
    def apply(x : Int) = x
  }
  val myId = new Identity

  // f(x) => f.apply(x)

  // object with apply method:
  object Id {
    def apply(x : Int) = x
  }


  println(Id.apply(3))
  // Prints:
  // 3

  println(myId.apply(4))
  // Prints:
  // 3

  println(Id(5))
  // Prints:
  // 3

  println(myId(6))
  // Prints:
  // 3

  // anonymous class with apply method:
  val myOtherId = new {
    def apply(x : Int) = x
  }

  // case blocks also act as functions:
  val myCaseID : Int => Int = {
    case x => x
  }


  println(myOtherId(7))
  // Prints:
  // 3

  println(myCaseID(8))
  // Prints:
  // 3

}

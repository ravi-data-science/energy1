package com.core.rootz

/**
  * Created by ravikiran on 11/6/2016.
  */
object  Class_parameters extends App{

  // Classes take parameters:
  class D(x : Int) {
    val field = x

    class inner_inner {

    }
  }


  // Parameters can also be fields:
  class E(val field : Int)


  // Parameters can be mutable fields:
  class F(var field : Int)
  val f = new F(3)
  f.field = 20


  // Parameters and fields can also be private:
  class G(private val initialX : Int) {
    private var myPrivateX = initialX
  }


}

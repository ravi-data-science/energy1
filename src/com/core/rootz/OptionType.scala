package com.core.rootz

/**
  * Created by ravikiran on 11/10/2016.
  */
object OptionType extends App{

  val m1 = Map("usa"-> "DC","India"->"delhi")
  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?" }
  println(show(m1.get("china")))
  println(show(m1.get("Core Universe")))
  println(show(m1.get("India")))

}

package com.scimath.roots

import org.apache.spark.mllib.util.MLUtils
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.feature.Binarizer
import org.apache.spark.ml.feature.VectorSlicer
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.feature.StandardScaler
import org.apache.spark.SparkConf
import org.apache.spark.mllib.clustering.StreamingKMeans
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.streaming.{Seconds, StreamingContext}

/**
  * Created by ravikiran on 9/24/2016.
  */
object CategoryML extends App {
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

  // convert DataFrame columns
  /*

  val convertedVecDF = MLUtils.convertVectorColumnsToML(vecDF)
  val convertedMatrixDF = MLUtils.convertMatrixColumnsToML(matrixDF)
  // convert a single vector or matrix
  val mlVec: org.apache.spark.ml.linalg.Vector = mllibVec.asML
  val mlMat: org.apache.spark.ml.linalg.Matrix = mllibMat.asML
  */
}


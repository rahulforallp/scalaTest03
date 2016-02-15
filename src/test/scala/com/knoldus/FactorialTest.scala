package com.knoldus

import org.scalatest.FunSuite
import scala.concurrent.duration._
import scala.concurrent.Await

/**
  * Created by knoldus on 15/2/16.
  */
class FactorialTest extends  FunSuite{

  test("calculate factorial"){
    val result=Factorial.calculte(List(9,1,8))
    val awaitedResult=Await.result(result,10 seconds)
    assert(awaitedResult==1)
  }

}

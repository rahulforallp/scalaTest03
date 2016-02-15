package com.knoldus



import scala.concurrent.{Promise, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Success, Failure}

/**
  * Created by knoldus on 15/2/16.
  */
object Factorial {

  def calculte(listOfNumber:List[Int]):Future[Int]={

    require(listOfNumber.nonEmpty)

    def factorial(n:Int):Int={
        if (n >=2 ) {
           n * factorial(n - 1)
          }
        else
          1
    }

    val promise = Promise[Int]
    val future = promise.future
    for(aNum<-listOfNumber){
      Future {
        val r = factorial(aNum)
        promise success (r)
      }
    }
    future
    }
}

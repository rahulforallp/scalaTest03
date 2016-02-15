package com.knoldus

import org.scalatest.FunSuite

/**
  * Created by knoldus on 15/2/16.
  */
class EmployeeTest extends  FunSuite{

  test("Check Ordering"){
    val listOfEmployee=List(Employee(1,"Rahul",25000),Employee(2,"Kunal",25000),Employee(3,"Sonu",20000))
    val result=listOfEmployee.sorted.map(_.empName)
    assert(result==List("Sonu", "Rahul", "Kunal"))
  }

}

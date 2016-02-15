package com.knoldus

/**
  * Created by knoldus on 15/2/16.
  *
  * case class has been defined to store the data of Employee.
  *
  * ordering function has been defined inside Employee object to compare employee object with salary.
  *
  */
case class Employee(id:Int,empName:String,salary:Long)

object Employee {

  implicit def ordering[A <: Employee]: Ordering[A] = Ordering.by{ employee: Employee =>
    (employee.salary)
  }

}

package com.joxoo.outtrac.data.model

data class Employee(
    val urn: String,
    var person: Person,
    val jobTitle: String,
    val department: String,
    val category: EmployeeCategoryEnum,
    val status: EmployeeStatusEnum,
    val workLogSummary: WorkLogSummary,
) {



}
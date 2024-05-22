package com.joxoo.outtrac.data.model

data class Person(
    val urn: String,
    val firstname: String,
    val lastname: String,
    val email: String,
    val address: Address,
) {
}
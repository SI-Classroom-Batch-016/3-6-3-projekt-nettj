package com.joxoo.outtrac.data.model

import androidx.lifecycle.LifecycleOwner

data class Person(
    val urn: String,
    val firstname: String,
    val lastname: String,
    val email: String,
    val address: Address,
) {

}
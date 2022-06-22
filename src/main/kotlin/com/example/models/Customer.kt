package com.example.models



@kotlinx.serialization.Serializable
data class Customer(val customerStorage: MutableList<Customer> = mutableListOf()){



}

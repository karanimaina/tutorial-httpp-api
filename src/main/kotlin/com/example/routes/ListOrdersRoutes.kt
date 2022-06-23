package com.example.routes

import com.example.models.orderStorage
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.listOrdersRoutes() {
    get("/order"){
    if (orderStorage.isNotEmpty()){
        call.respond (orderStorage)
    }
    }

}
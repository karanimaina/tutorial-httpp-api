package com.example.plugins

import com.example.routes.customerRouting
import com.example.routes.getOrderRoute
import com.example.routes.listOrdersRoutes
import com.example.routes.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoutes()
        getOrderRoute()
        totalizeOrderRoute()

    }
}

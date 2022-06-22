package com.example.routes

import io.ktor.server.routing.*

fun Route.customerRouting(){
    route("customer"){
        get{
            if (CustomerStorage)
        }
        get("{id?}"){}
        post {}
        delete ("{id?}"){  }
    }

}
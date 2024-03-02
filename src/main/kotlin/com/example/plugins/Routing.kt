package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        staticResources("/content", "mycontent")

        get("/") {
            call.respondText("Hello World!")
        }
        get("/beans") {
            val text = "<h1>Here are your beans</h1>"
            val type = ContentType.parse("text/html")
            call.respondText(text, type)
        }

        get("/hello") {
            val text = "<h1>Hello from Ktor</h1>"
            val type = ContentType.parse("text/html")
            call.respondText(text, type)
        }
    }
}



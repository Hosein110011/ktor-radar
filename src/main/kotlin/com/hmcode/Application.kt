package com.hmcode

import com.hmcode.models.TicTacToeGame
import com.hmcode.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8000, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    val game = TicTacToeGame()
    configureMonitoring()
    configureSerialization()
    configureSockets()
    configureRouting(game)
}

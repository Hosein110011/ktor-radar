package com.hmcode.plugins

import com.hmcode.models.TicTacToeGame
import com.hmcode.socket
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(game: TicTacToeGame) {
    routing {
        socket(game)
    }
}

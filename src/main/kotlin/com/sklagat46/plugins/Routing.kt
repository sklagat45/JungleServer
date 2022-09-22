package com.sklagat46.plugins

import com.sklagat46.routes.customerRouting
import com.sklagat46.routes.getOrderRoute
import com.sklagat46.routes.listOrdersRoute
import com.sklagat46.routes.totalizeOrderRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {

        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}

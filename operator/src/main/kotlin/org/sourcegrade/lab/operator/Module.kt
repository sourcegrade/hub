package org.sourcegrade.lab.operator

import com.expediagroup.graphql.server.ktor.graphQLPostRoute
import com.expediagroup.graphql.server.operations.Query
import io.ktor.client.HttpClient
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.routing.Routing

class HelloWorldQuery : Query {
    fun hello(): String = "Hello World!"
}

fun Application.module(client: HttpClient) {
    install(Routing) {
        graphQLPostRoute()
    }
}

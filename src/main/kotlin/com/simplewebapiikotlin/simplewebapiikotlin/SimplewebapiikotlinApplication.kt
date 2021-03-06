package com.simplewebapiikotlin.simplewebapiikotlin

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition(info = Info(title = "User API", version = "1.0",
	description = "Documentation of the User API v1.0"))
class SimplewebapiikotlinApplication

fun main(args: Array<String>) {
	runApplication<SimplewebapiikotlinApplication>(*args)
}

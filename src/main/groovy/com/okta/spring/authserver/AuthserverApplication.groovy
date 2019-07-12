package com.okta.spring.authserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer

@SpringBootApplication
@EnableResourceServer
class AuthserverApplication {

    static void main(String[] args) {
        SpringApplication.run(AuthserverApplication, args)
    }

}

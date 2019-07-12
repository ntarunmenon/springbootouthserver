package com.okta.spring.authserver

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import java.security.Principal

@RestController
class UserController {

    @GetMapping("/user/me")
    Principal user(Principal principal) {
        return principal
    }

}

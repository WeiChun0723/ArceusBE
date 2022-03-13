package com.example.arceus.User

import com.example.arceus.User.Service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController @Autowired constructor( private val userService: UserService) {

    @GetMapping("/users")
    fun all(): List<String> {
        return userService.getUsers()
    }
}
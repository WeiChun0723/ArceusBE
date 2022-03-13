package com.example.arceus.user.controller

import com.example.arceus.user.Resource
import com.example.arceus.user.model.User
import com.example.arceus.user.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController @Autowired constructor( private val userService: UserService) {

    @GetMapping("/users")
    fun all(): List<Resource?> {
        return userService.getUsers()
    }
}
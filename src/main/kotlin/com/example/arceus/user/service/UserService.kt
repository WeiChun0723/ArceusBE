package com.example.arceus.user.service

import com.example.arceus.user.controller.Resource
import com.example.arceus.user.model.User
import com.example.arceus.user.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserService @Autowired constructor(private val userRepository: UserRepository) {

    fun getUsers() = userRepository.findAll().toList().map(::toResource)

    private fun toResource(user: User?) = user?.let {
        Resource(it.id, it.name)
    }
}
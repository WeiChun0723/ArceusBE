package com.example.arceus.User.Service

import org.springframework.stereotype.Component

@Component
class UserService {

    fun getUsers() = listOf(
        "Zeus",
        "Hera",
        "Poseidon",
        "Zeus",
        "Hera",
        "Poseidon",
        "Demeter",
        "Athena",
        "Apollo",
        "Artemis",
        "Ares",
        "Hephaestus",
        "Aphrodite",
        "Hermes"
    )
}
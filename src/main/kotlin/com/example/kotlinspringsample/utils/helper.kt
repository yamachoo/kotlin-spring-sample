package com.example.kotlinspringsample.utils

import com.example.kotlinspringsample.domain.User

val users = mutableListOf(User(1, "test"))

fun readUsers() = users

fun findUser(id: Int) = users.find { it.id == id }

fun addUser(name: String): User {
    val lastUser = users.last()
    val newUser = User(lastUser.id + 1, name)

    users.add(newUser)

    return newUser
}

fun fixUser(id: Int, name: String): User? {
    val user = users.find { it.id == id }
    user?.name = name

    return user
}

fun removeUser(id: Int): Boolean {
    val user = users.find { it.id == id }
    users.remove(user)

    return true
}

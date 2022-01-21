package com.example.kotlinspringsample.queries

import com.example.kotlinspringsample.utils.findUser
import com.example.kotlinspringsample.utils.readUsers
import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Component

@Component
class UserQuery : Query {
    fun users() = readUsers()
    fun user(userId: Int) = findUser(userId)
}

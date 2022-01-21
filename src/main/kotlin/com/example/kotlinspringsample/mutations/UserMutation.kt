package com.example.kotlinspringsample.mutations

import com.example.kotlinspringsample.utils.addUser
import com.example.kotlinspringsample.utils.fixUser
import com.example.kotlinspringsample.utils.removeUser
import com.expediagroup.graphql.server.operations.Mutation
import org.springframework.stereotype.Component

@Component
class UserMutation : Mutation {
    fun createUser(name: String) = addUser(name)
    fun updateUser(id: Int, name: String) = fixUser(id, name)
    fun deleteUser(id: Int) = removeUser(id)
}

package com.example.rolebasedandgoogleauth.data.model

import com.example.rolebasedandgoogleauth.data.model.UserRole

data class AppUser(
    val uid: String = "",
    val email: String = "",
    val username: String = "",
    val role: UserRole = UserRole.NORMAL,
    val loginProvider: String = "EMAIL",
    val photoUrl: String = ""
)
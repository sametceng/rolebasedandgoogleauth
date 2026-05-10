package com.example.rolebasedandgoogleauth.data.model

enum class UserRole {
    NORMAL,
    PREMIUM,
    ADMIN;

    companion object {
        fun fromString(value: String?): UserRole {
            return when (value?.uppercase()) {
                "PREMIUM" -> PREMIUM
                "ADMIN" -> ADMIN
                else -> NORMAL
            }
        }
    }
}
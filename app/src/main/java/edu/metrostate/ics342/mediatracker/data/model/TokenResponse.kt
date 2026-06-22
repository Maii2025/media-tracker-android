package edu.metrostate.ics342.mediatracker.data.model

data class TokenResponse(
    val token: String,
    val email: String,
    val password: String
)
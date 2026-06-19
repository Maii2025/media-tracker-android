package edu.metrostate.ics342.mediatracker.data.model


import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.Response

interface ApiService {
    @POST("users")
    suspend fun createUser(
        @Body request: CreateUserRequest
    ): CreateUserResponse

    @POST("tokens")
    suspend fun login(
        @Body request: TokenRequest
    ): TokenResponse

}
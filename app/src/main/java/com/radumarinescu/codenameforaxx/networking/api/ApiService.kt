package com.radumarinescu.codenameforaxx.networking.api

import com.radumarinescu.codenameforaxx.networking.model.Post
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): List<Post>
}
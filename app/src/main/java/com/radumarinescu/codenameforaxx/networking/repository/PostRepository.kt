package com.radumarinescu.codenameforaxx.networking.repository

import com.radumarinescu.codenameforaxx.networking.api.ApiService
import com.radumarinescu.codenameforaxx.networking.model.Post
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getPosts(): List<Post> {
        return apiService.getPosts()
    }
}
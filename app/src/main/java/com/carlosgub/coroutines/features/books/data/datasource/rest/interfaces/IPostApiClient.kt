package com.carlosgub.coroutines.features.books.data.datasource.rest.interfaces
import com.carlosgub.coroutines.features.books.data.datasource.rest.response.PostResponseData
import com.carlosgub.coroutines.features.books.data.datasource.rest.response.PostResponseRoot
import retrofit2.http.GET
import retrofit2.http.Path

interface IPostApiClient {
    @GET("/api/v3/price/all_prices_for_mobile?counter_currency=USD")     //  /posts
    suspend fun getPosts(): PostResponseRoot

    @GET("/posts/{id}")
    suspend fun getPostById(@Path("id") id:String): PostResponseData
}
package com.bluemoonl.ch15airbnb

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/f64b932e-ca51-417f-ba19-36e8efa2a47f")
    fun getHouseList(): Call<HouseDto>
}
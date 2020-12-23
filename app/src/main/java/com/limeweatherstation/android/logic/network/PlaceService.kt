package com.limeweatherstation.android.logic.network

import com.limeweatherstation.android.LimeWeatherStationApplication
import com.limeweatherstation.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * 用于访问彩云天气城市搜索API的Retrofit接口
 */
interface PlaceService {

    /**
     * 返回值Call<PlaceResponse>，使得Retrofit自动将服务器返回的JSON数据解析成PlaceResponse对象
     */
    @GET("v2/place?token=${LimeWeatherStationApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}
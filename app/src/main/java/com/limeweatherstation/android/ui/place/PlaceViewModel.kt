package com.limeweatherstation.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.limeweatherstation.android.logic.Repository
import com.limeweatherstation.android.logic.model.Place

class PlaceViewModel : ViewModel() {

    private val searchLivaData = MutableLiveData<String>()

    //缓存界面上显示的城市
    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLivaData) {
        //调用仓库的searchPlaces方法发起网络请求
        query -> Repository.searchPlaces(query)
        //同时把仓库层返回的LivaData对象转换成Activity可观察的LivaData对象
    }

    /**
     * 该方法调用时，switchMap方法内的转换函数会执行
     */
    fun searchPlaces(query: String) {
        searchLivaData.value = query
    }
}
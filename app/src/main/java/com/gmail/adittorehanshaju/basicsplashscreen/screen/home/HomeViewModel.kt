package com.gmail.adittorehanshaju.basicsplashscreen.screen.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private var _splashScreen = true
    val splashScreen
        get() = _splashScreen

    fun splashScreenStatus() {
        _splashScreen = false
    }
}
package com.gmail.adittorehanshaju.basicsplashscreen.screen.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    var splashScreen = true

    fun splashCompleted() {
        splashScreen = false
    }
}
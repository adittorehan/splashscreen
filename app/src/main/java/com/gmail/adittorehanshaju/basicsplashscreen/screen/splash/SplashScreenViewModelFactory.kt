package com.gmail.adittorehanshaju.basicsplashscreen.screen.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SplashScreenViewModelFactory(private val splashTime: Long) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SplashScreenViewModel::class.java)) return SplashScreenViewModel(
            splashTime
        ) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}
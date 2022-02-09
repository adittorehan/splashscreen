package com.gmail.adittorehanshaju.basicsplashscreen.screen.splash

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController

class SplashScreenViewModel(splashTime: Long) : ViewModel() {

    private val _exitStatus = MutableLiveData<Boolean>()
    val exitStatus: LiveData<Boolean>
        get() = _exitStatus

    val timer: CountDownTimer

    init {
        _exitStatus.value = false
        timer = object : CountDownTimer(splashTime, 1000L) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                _exitStatus.value = true
            }
        }

    }


}
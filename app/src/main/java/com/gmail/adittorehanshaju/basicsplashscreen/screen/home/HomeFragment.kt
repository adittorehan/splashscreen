package com.gmail.adittorehanshaju.basicsplashscreen.screen.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.gmail.adittorehanshaju.basicsplashscreen.R


class HomeFragment : Fragment() {
    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        onStartSplashScreen()

        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    private fun onStartSplashScreen() {

        if (viewModel.splashScreen) findNavController()
            .navigate(
                HomeFragmentDirections
                    .actionHomeToSplashScreen()
            )
        viewModel.splashCompleted()
    }


}
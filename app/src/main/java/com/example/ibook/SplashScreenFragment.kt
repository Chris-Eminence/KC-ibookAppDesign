package com.example.ibook

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import com.example.ibook.databinding.ActivityMainBinding.inflate
import com.example.ibook.databinding.ActivityOnboardingBinding.inflate

class SplashScreenFragment : Fragment() {

    lateinit var handler: Handler

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)

        handler = Handler()
        handler.postDelayed({

            // Delay and Start Activity
            val intent = Intent(requireContext(), OnboardingFragment::class.java)
            startActivity(intent)
        } , 3000) // here we're delaying to startActivity after 3seconds


        return view
    }




}
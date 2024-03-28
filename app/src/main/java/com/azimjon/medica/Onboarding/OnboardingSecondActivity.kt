package com.azimjon.medica.Onboarding

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azimjon.medica.R
import com.azimjon.medica.databinding.ActivityMainBinding
import com.azimjon.medica.databinding.ActivityOnboardingFirstBinding
import com.azimjon.medica.databinding.ActivityOnboardingSecondBinding
import com.azimjon.medica.databinding.ActivitySecondSplashScreen2Binding

class OnboardingSecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var intent = Intent(this, OnboardingThirdActivity::class.java)
            startActivity(intent)
        }

    }
}
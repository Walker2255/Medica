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
import com.azimjon.medica.databinding.ActivityOnboardingFiveBinding
import com.azimjon.medica.databinding.ActivityOnboardingFourBinding
import com.azimjon.medica.databinding.ActivityOnboardingThirdBinding

class OnboardingFiveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingFiveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingFiveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var intent = Intent(this, OnboardingSixActivity::class.java)
            startActivity(intent)
        }


    }
}
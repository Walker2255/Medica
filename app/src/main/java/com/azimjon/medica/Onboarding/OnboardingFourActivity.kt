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
import com.azimjon.medica.databinding.ActivityOnboardingFourBinding
import com.azimjon.medica.databinding.ActivityOnboardingThirdBinding

class OnboardingFourActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingFourBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingFourBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var intent = Intent(this, OnboardingFiveActivity::class.java)
            startActivity(intent)
        }


    }
}
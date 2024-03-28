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

class OnboardingFirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var intent = Intent(this, OnboardingSecondActivity::class.java)
            startActivity(intent)
        }


    }
}
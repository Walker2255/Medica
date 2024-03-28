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
import com.azimjon.medica.databinding.ActivityOnboardingSixBinding
import com.azimjon.medica.databinding.ActivityOnboardingThirdBinding
import com.azimjon.medica.signinpages.LetsInActivity

class OnboardingSixActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingSixBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingSixBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var intent = Intent(this, LetsInActivity::class.java)
            startActivity(intent)
        }


    }
}
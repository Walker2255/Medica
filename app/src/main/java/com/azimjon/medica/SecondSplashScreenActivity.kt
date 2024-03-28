package com.azimjon.medica

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azimjon.medica.Onboarding.OnboardingFirstActivity
import com.azimjon.medica.databinding.ActivitySecondSplashScreen2Binding

class SecondSplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondSplashScreen2Binding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySecondSplashScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, OnboardingFirstActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)


    }
}
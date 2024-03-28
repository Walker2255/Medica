package com.azimjon.medica.signinpages

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azimjon.medica.R
import com.azimjon.medica.databinding.ActivityLetsInBinding

class LetsInActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLetsInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLetsInBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button2.setOnClickListener {
            var intent = Intent(this, CreateNewAccountActivity::class.java)
            startActivity(intent)
        }
        binding.nextstep.setOnClickListener {
            var intent = Intent(this, CreateNewAccountActivity::class.java)
            startActivity(intent)
        }

    }
}
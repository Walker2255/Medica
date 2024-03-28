package com.azimjon.medica.signinpages

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azimjon.medica.R
import com.azimjon.medica.databinding.ActivityCreateNewAccountBinding

class CreateNewAccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateNewAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateNewAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backpage.setOnClickListener {
            var intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
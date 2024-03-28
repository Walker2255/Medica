package com.azimjon.medica

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.azimjon.medica.databinding.ActivitySplashScreen2Binding
import com.bumptech.glide.Glide

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreen2Binding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreen2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var imageview = binding.giff

        Glide.with(this)
            .load(R.drawable.animation)
            .into(imageview)




        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, SecondSplashScreenActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)

    }
}
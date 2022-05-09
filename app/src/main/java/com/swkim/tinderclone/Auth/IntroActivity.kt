package com.swkim.tinderclone.Auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swkim.tinderclone.R
import com.swkim.tinderclone.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    lateinit var binding : ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityIntroBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.joinBtn.setOnClickListener {
            startActivity(Intent(this, JoinActivity::class.java))
        }

        binding.loginBtn.setOnClickListener {

        }
    }
}
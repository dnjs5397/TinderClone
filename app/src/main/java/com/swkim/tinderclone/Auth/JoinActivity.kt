package com.swkim.tinderclone.Auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.swkim.tinderclone.R
import com.swkim.tinderclone.databinding.ActivityJoinBinding

class JoinActivity : AppCompatActivity() {

    lateinit var auth : FirebaseAuth
    lateinit var binding : ActivityJoinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityJoinBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.joinOkBtn.setOnClickListener {
            val email = binding.emailArea.text.toString()
            val password = binding.passwordArea.text.toString()

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this@JoinActivity, "회원가입에 성공하였습니다.", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this@JoinActivity, "회원가입에 실패하였습니다.", Toast.LENGTH_SHORT).show()
                    }
                }

        }




    }
}
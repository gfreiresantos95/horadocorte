package com.gabrielfreire.horadocorte

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gabrielfreire.horadocorte.databinding.ActivityLoginOptionsBinding

class LoginOptionsActivity : AppCompatActivity() {

    private lateinit var loginOptionsBinding: ActivityLoginOptionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginOptionsBinding = ActivityLoginOptionsBinding.inflate(layoutInflater)
        setContentView(loginOptionsBinding.root)
    }
}
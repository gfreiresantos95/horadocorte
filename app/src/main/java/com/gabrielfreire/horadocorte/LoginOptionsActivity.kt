package com.gabrielfreire.horadocorte

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gabrielfreire.horadocorte.databinding.ActivityLoginOptionsBinding

class LoginOptionsActivity : AppCompatActivity() {

    private lateinit var loginOptionsBinding: ActivityLoginOptionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginOptionsBinding = ActivityLoginOptionsBinding.inflate(layoutInflater)
        setContentView(loginOptionsBinding.root)

        setListeners()
    }

    private fun setListeners() {
        with(loginOptionsBinding) {
            btnLoginOptionCustomer.setOnClickListener {
                val intent = Intent(this@LoginOptionsActivity, CustomerLoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
package com.gabrielfreire.horadocorte

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gabrielfreire.horadocorte.databinding.ActivityCustomerLoginBinding

class CustomerLoginActivity : AppCompatActivity() {

    private lateinit var customerLoginBinding: ActivityCustomerLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        customerLoginBinding = ActivityCustomerLoginBinding.inflate(layoutInflater)
        setContentView(customerLoginBinding.root)
    }
}
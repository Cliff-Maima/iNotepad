package com.bersyte.noteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LogIn : AppCompatActivity() {
    private lateinit var email_input: EditText
    private lateinit var pass_input: EditText
    private lateinit var log_input: Button
    private lateinit var sign_input: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        email_input= findViewById(R.id.email_input)
        pass_input= findViewById(R.id.password_input)
        log_input= findViewById(R.id.login_btn)
        sign_input= findViewById(R.id.create_btn)

        sign_input.setOnClickListener {

            Toast.makeText(this,"Going to SignUp page...", Toast.LENGTH_SHORT).show()
            var registeruser= Intent(this,Register::class.java)
            startActivity(registeruser)
        }
        log_input.setOnClickListener {

            var registeruser= Intent(this,MainActivity::class.java)
            startActivity(registeruser)
            finish()
        }
    }
}
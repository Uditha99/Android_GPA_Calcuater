package com.example.project101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var dbh = SQLite(this)
        var usernameLogin = findViewById<EditText>(R.id.usernameLogin)
        var passwordLogin = findViewById<EditText>(R.id.passwordLogin)
        var loginBtn = findViewById<Button>(R.id.buttonLogin)
        var registerBtn = findViewById<Button>(R.id.buttonRegister)

        loginBtn.setOnClickListener {
            val usertx = usernameLogin.text.toString()
            val passtx = passwordLogin.text.toString()

            if (TextUtils.isEmpty(usertx)|| TextUtils.isEmpty(passtx)){
                Toast.makeText(this, "Enter username & password", Toast.LENGTH_SHORT).show()
            }else{

                val cheack = dbh.getStudentData(usertx,passtx)


                if(cheack==true){
                    Toast.makeText(this, "Login Succsessfull", Toast.LENGTH_SHORT).show()
                    val intent = Intent(applicationContext , DepartmentSelectActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this, "Wrong Username or password", Toast.LENGTH_SHORT).show()
                }
            }
        }

        registerBtn.setOnClickListener {
            val intent = Intent(this , RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
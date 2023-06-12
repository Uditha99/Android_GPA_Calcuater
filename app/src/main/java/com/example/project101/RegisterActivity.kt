package com.example.project101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var db = SQLite(this)

        var username = findViewById<EditText>(R.id.userName)
        var email = findViewById<EditText>(R.id.email)
        var password = findViewById<EditText>(R.id.password)
        var confirm_Password = findViewById<EditText>(R.id.confirmPassword)
        var createAccount_Btn = findViewById<Button>(R.id.btnCreateAccount)
        var sigIn = findViewById<Button>(R.id.btnSignin)

        createAccount_Btn.setOnClickListener {

            var usernameText = username.text.toString()
            var emailText = email.text.toString()
            var passwordText = password.text.toString()
            var confirm_PasswordText = confirm_Password.text.toString()

            val saveData = db.insertStudentData(usernameText,emailText,passwordText)

            if(TextUtils.isEmpty(usernameText)||TextUtils.isEmpty(emailText)||TextUtils.isEmpty(passwordText)||TextUtils.isEmpty(confirm_PasswordText)){
                Toast.makeText(this, "Add username & email & Password & Confirm Password", Toast.LENGTH_SHORT).show()
            }else{
                if (passwordText.equals(confirm_PasswordText)){

                    if(saveData==false){
                        Toast.makeText(this, "User doesn't Exist", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(this, "Register is succsessfuly", Toast.LENGTH_SHORT).show()
                        val intent = Intent(applicationContext , LoginActivity::class.java)
                        startActivity(intent)

                    }
                }else{
                    Toast.makeText(this, "Confirm Password is not match", Toast.LENGTH_SHORT).show()
                }

            }

        }
        sigIn.setOnClickListener {
            val intent = Intent(applicationContext , LoginActivity::class.java)
            startActivity(intent)
        }


    }
}
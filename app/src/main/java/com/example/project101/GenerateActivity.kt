package com.example.project101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlin.math.roundToInt

class GenerateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generate)

        var x = intent.getStringExtra("gpa").toString().toDouble()
        var text1 = findViewById<TextView>(R.id.textView29)
        var gpaText = findViewById<TextView>(R.id.gpaText)



        var gpa1 =((x*100.0).roundToInt()/100.0)


        if (gpa1>4.0){
            gpaText.text="ERROR!"
            text1.text = ""

        }else{
            gpaText.text=gpa1.toString()
            text1.text = "Congratulations you got have a"
            select(gpa1)


        }





    }

    fun select(gpa : Double){
        var class1 = findViewById<TextView>(R.id.class1)

        if(gpa>3.7){
            class1.text="First class GPA"
        }else if(gpa>=3.3 && gpa<3.7){
            class1.text="Second Upper class GPA"
        }else if(gpa>=3.0 && gpa<3.3){
            class1.text="Second Lower class GPA "
        }else{
            class1.text="General pass GPA"
        }



    }
}
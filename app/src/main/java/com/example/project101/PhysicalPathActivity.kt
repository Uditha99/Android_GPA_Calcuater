package com.example.project101

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import physical.path01.PSYear1Path1Activity
import physical.path02.PSYear1Path2Activity

class PhysicalPathActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_physical_path)

        var path1 = findViewById<Button>(R.id.btnpath1)
        var path2 = findViewById<Button>(R.id.btnpath2)


        path1.setOnClickListener {
            val intent = Intent(this , PSYear1Path1Activity::class.java)
            startActivity(intent)
        }

        path2.setOnClickListener {
            val intent = Intent(this , PSYear1Path2Activity::class.java)
            startActivity(intent)
        }
    }
}
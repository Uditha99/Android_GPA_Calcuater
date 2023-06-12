package com.example.project101


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import pe.PEYear01Activity

class DepartmentSelectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_department_select)

        var phys_btn = findViewById<Button>(R.id.btn_physc)
        var pe_btn = findViewById<Button>(R.id.btn_pe)


        phys_btn.setOnClickListener {
            val intent = Intent(this , PhysicalPathActivity::class.java)
            startActivity(intent)
        }

        pe_btn.setOnClickListener {
            val intent = Intent(this , PEYear01Activity::class.java)
            startActivity(intent)
        }

    }
}
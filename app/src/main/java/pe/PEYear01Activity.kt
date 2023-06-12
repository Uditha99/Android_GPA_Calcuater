package pe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.project101.R
import kotlin.math.roundToInt

class PEYear01Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peyear01)

        var totalGPA1 = 0.0

        var button = findViewById<Button>(R.id.button)
        var nextYear = findViewById<Button>(R.id.btn_2ndyear)

        var code1 = findViewById<TextView>(R.id.res1)
        var code2 = findViewById<TextView>(R.id.result2)
        var code3 = findViewById<TextView>(R.id.result3)
        var code4 = findViewById<TextView>(R.id.result4)
        var code5 = findViewById<TextView>(R.id.result5)
        var code6 = findViewById<TextView>(R.id.result6)
        var code7 = findViewById<TextView>(R.id.result7)


        var code8 = findViewById<TextView>(R.id.result8)
        var code9 = findViewById<TextView>(R.id.result9)
        var code10 = findViewById<TextView>(R.id.result10)
        var code11= findViewById<TextView>(R.id.result11)
        var code12 = findViewById<TextView>(R.id.result12)
        var code13 = findViewById<TextView>(R.id.result13)
        var code14 = findViewById<TextView>(R.id.result14)
        var code15 = findViewById<TextView>(R.id.result15)
        var code16 = findViewById<TextView>(R.id.result16)

        var totalCredit = 35

        button.setOnClickListener {
            var totalGPA = 0.0
            var display1 = findViewById<TextView>(R.id.gpa)
            display1.text ="GPA : " + totalGPA.toString()

            var result = selectResult(code1.text.toString())
            totalGPA+=result*3/totalCredit

            var result2 = selectResult(code2.text.toString())
            totalGPA+=result2*2/totalCredit

            var result3 = selectResult(code3.text.toString())
            totalGPA+=result3*3/totalCredit

            var result4 = selectResult(code4.text.toString())
            totalGPA+=result4*1/totalCredit

            var result5 = selectResult(code5.text.toString())
            totalGPA+=result5*2/totalCredit

            var result6 = selectResult(code6.text.toString())
            totalGPA+=result6*1/totalCredit

            var result7 = selectResult(code7.text.toString())
            totalGPA+=result7*2/totalCredit


            var result15 = selectResult(code15.text.toString())
            totalGPA+=result15*3/totalCredit

            var result16 = selectResult(code16.text.toString())
            totalGPA+=result16*2/totalCredit

            var result10 = selectResult(code10.text.toString())
            totalGPA+=result10*3/totalCredit

            var result11= selectResult(code11.text.toString())
            totalGPA+=result11*4/totalCredit

            var result12 = selectResult(code12.text.toString())
            totalGPA+=result12*1/totalCredit

            var result13 = selectResult(code13.text.toString())
            totalGPA+=result13*2/totalCredit

            var result14 = selectResult(code14.text.toString())
            totalGPA+=result14*2/totalCredit

            var result8 = selectResult(code8.text.toString())
            totalGPA+=result8*1/totalCredit


            var result9 = selectResult(code9.text.toString())
            totalGPA+=result9*3/totalCredit

            totalGPA1=totalGPA/3
            validateGPA(totalGPA)

            var z = ((totalGPA*100.0).roundToInt()/100.0)

            validateGPA(z)






        }
        nextYear.setOnClickListener {

            val intent = Intent(this , PEYear02Activity::class.java)
            intent.putExtra("gpa" ,totalGPA1.toString() )
            startActivity(intent)

        }
    }
    fun selectResult(result:String): Double {
        when (result) {
            "A+", "a+","A","a"-> return 4.0
            "A-","a-" -> return 3.7
            "B+","b-" -> return 3.3
            "B","b" -> return 3.0
            "B-","b-" -> return 2.7
            "C+" ,"c+"-> return 2.3
            "C" ,"c"-> return 2.0
            "C-","c-" -> return 1.7
            "D+","d+" -> return 1.3
            "D","d"-> return 1.0
            "E","e"-> return 0.0
            ""->return 0.0
            else -> Toast.makeText(applicationContext, "error", Toast.LENGTH_SHORT).show()

        }
        return 1000.0
    }

    fun validateGPA(totalGPA : Double){
        var but= findViewById<TextView>(R.id.gpa)

        if (totalGPA>4.0){
            but.text="Recheck your result"
        }else{
            but.text = "GPA : " +totalGPA.toString()
        }
    }
}
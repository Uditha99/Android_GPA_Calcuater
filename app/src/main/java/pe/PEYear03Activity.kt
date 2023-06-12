package pe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.project101.GenerateActivity
import com.example.project101.R
import kotlin.math.roundToInt

class PEYear03Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_peyear03)


        var x = intent.getStringExtra("gpa").toString().toDouble()

        var button = findViewById<Button>(R.id.button)
        var button2 = findViewById<Button>(R.id.reprt1_btn)


        var code1 = findViewById<TextView>(R.id.res1)
        var code2 = findViewById<TextView>(R.id.result2)
        var code3 = findViewById<TextView>(R.id.result3)
        var code4 = findViewById<TextView>(R.id.result4)
        var code5 = findViewById<TextView>(R.id.result5)
        var editcode1 = findViewById<TextView>(R.id.enterCode1)
        var enterResult1 = findViewById<TextView>(R.id.enterResult1)
        var editcode3 = findViewById<TextView>(R.id.enterCode3)
        var enterResult3 = findViewById<TextView>(R.id.enterResult3)

        var code12 = findViewById<TextView>(R.id.result150)
        var code13 = findViewById<TextView>(R.id.result151)


        var code8 = findViewById<TextView>(R.id.result8)
        var code9 = findViewById<TextView>(R.id.result9)
        var code10 = findViewById<TextView>(R.id.result10)
        var code11= findViewById<TextView>(R.id.result11)
        var editcode2 = findViewById<TextView>(R.id.enterCode2)
        var enterResult2 = findViewById<TextView>(R.id.enterResult2)
        var editcode4 = findViewById<TextView>(R.id.enterCode4)
        var enterResult4 = findViewById<TextView>(R.id.enterResult4)




        button.setOnClickListener {
            var totalGPA = 0.0
            var totalCredit= 24

            var result12 = selectResult(enterResult1.text.toString())
            totalCredit+=getCredit(editcode1)


            var result13 = selectResult(enterResult2.text.toString())
            totalCredit+=getCredit(editcode2)

            var result14 = selectResult(enterResult3.text.toString())
            totalCredit+=getCredit(editcode3)

            var result15 = selectResult(enterResult4.text.toString())
            totalCredit+=getCredit(editcode4)

            totalGPA+=result13*getCredit(editcode2)/totalCredit
            totalGPA+=result12*getCredit(editcode1)/totalCredit
            totalGPA+=result14*getCredit(editcode3)/totalCredit
            totalGPA+=result15*getCredit(editcode4)/totalCredit

            var display1 = findViewById<TextView>(R.id.gpa)
            display1.text ="GPA : " + totalGPA.toString()

            var result = selectResult(code1.text.toString())
            totalGPA+=result*3/totalCredit

            var result2 = selectResult(code2.text.toString())
            totalGPA+=result2*1/totalCredit

            var result3 = selectResult(code3.text.toString())
            totalGPA+=result3*2/totalCredit

            var result4 = selectResult(code4.text.toString())
            totalGPA+=result4*1/totalCredit

            var result5 = selectResult(code5.text.toString())
            totalGPA+=result5*2/totalCredit

            var result150 = selectResult(code12.text.toString())
            totalGPA+=result150*3/totalCredit

            var result151 = selectResult(code13.text.toString())
            totalGPA+=result151*2/totalCredit










            var result10 = selectResult(code10.text.toString())
            totalGPA+=result10*4/totalCredit

            var result11= selectResult(code11.text.toString())
            totalGPA+=result11*2/totalCredit

            var result8 = selectResult(code8.text.toString())
            totalGPA+=result8*2/totalCredit

            var result9 = selectResult(code9.text.toString())
            totalGPA+=result9*2/totalCredit



            validateTotalCredit(totalCredit)
            var z = ((totalGPA*100.0).roundToInt()/100.0)
            validateGPA(z)

            x=x+totalGPA/3




        }

        button2.setOnClickListener {

            var intent = Intent(this,GenerateActivity::class.java)
            intent.putExtra("gpa",x.toString())
            startActivity(intent)
        }




    }


    fun getCredit(x :TextView): Int {

        var credit=0

        var text = x.text.toString().last().toString()



        if (text=="2"){
            credit=2
        }else if(text=="3"){
            credit= 3
        }else if(text=="4"){
            credit= 3
        }else if(text=="5"){
            credit= 3
        }else if(text=="6"){
            credit= 3
        }else if(text=="1") {
            credit = 1
        }
//        }else{
//            credit= 0
//        }

        else if(text==" "){
            credit= 0
        }else{
           credit= 0
        }

        return credit

    }

    fun validateTotalCredit(totalCredit : Int){
        var but= findViewById<TextView>(R.id.gpa)

        if (totalCredit>35) {
            but.text = "Recheck your CODE Name"
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


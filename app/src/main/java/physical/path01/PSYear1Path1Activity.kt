package physical.path01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.project101.LoginActivity
import com.example.project101.R


class PSYear1Path1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psyear1path1)




        //var spining = findViewById<Spinner>(R.id.spinner173)



        var button = findViewById<Button>(R.id.button)
        var nextYear = findViewById<Button>(R.id.nextyear_btn)

        var addCredit = 0
       // addCredit +=addArray(spining){addCredit->}


        //var result1 = findViewById<Spinner>(R.id.result1)
       // addResult(result1)



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





        button.setOnClickListener {
            var totalGPA = 0.0
            var display1 = findViewById<TextView>(R.id.gpa)
            display1.text ="GPA : " + totalGPA.toString()

            var result = selectResult(code1.text.toString())
            totalGPA+=result*3/30

            var result2 = selectResult(code2.text.toString())
            totalGPA+=result2*2/30

            var result3 = selectResult(code3.text.toString())
            totalGPA+=result3*2/30

            var result4 = selectResult(code4.text.toString())
            totalGPA+=result4*1/30

            var result5 = selectResult(code5.text.toString())
            totalGPA+=result5*2/30

            var result6 = selectResult(code6.text.toString())
            totalGPA+=result6*3/30

            var result7 = selectResult(code7.text.toString())
            totalGPA+=result7*2/30


            var result8 = selectResult(code8.text.toString())
            totalGPA+=result8*2/30

            var result9 = selectResult(code9.text.toString())
            totalGPA+=result9*3/30

            var result10 = selectResult(code10.text.toString())
            totalGPA+=result10*2/30

            var result11= selectResult(code11.text.toString())
            totalGPA+=result11*2/30

            var result12 = selectResult(code12.text.toString())
            totalGPA+=result12*1/30

            var result13 = selectResult(code13.text.toString())
            totalGPA+=result13*2/30

            var result14 = selectResult(code14.text.toString())
            totalGPA+=result14*3/30







            display1.text = "GPA : " +totalGPA.toString()

        }

        nextYear.setOnClickListener {

        }


    }
    fun selectResult(result:String): Double {
        when (result) {
            "A+" -> return 4.0
            "A" -> return 4.0
            "A-" -> return 3.7
            "B+" -> return 3.3
            "B" -> return 3.0
            "B-" -> return 2.7
            "C+" -> return 2.3
            "C" -> return 2.0
            "C-" -> return 1.7
            "D+" -> return 1.3
            "D" -> return 1.0
            "E" -> return 0.0


        }
        return 0.0
    }
    /*fun addArray(spinner: Spinner ,callback: (Int) -> Unit): Int {
        var x = ""

        var y = 10
        var arrayData = arrayOf("COSC 12342" , "COSC 11543" , "PMAT 11342")
        var arrAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayData)
        spinner.adapter=arrAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                 x = arrayData[position].toString().last().toString()
                Toast.makeText(applicationContext, "Char : "+ arrayData[position].toString().last(), Toast.LENGTH_SHORT).show()
                y= getCredit(x)
                Toast.makeText(applicationContext, "number : " + y, Toast.LENGTH_SHORT).show()
                callback(y)

                var display = findViewById<TextView>(R.id.textView3)



            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
        return y


    }

    fun addResult(spinner: Spinner){
        var arrayData1 = arrayOf("A+" , "A" , "A-")
        val arrAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayData1)
        spinner.adapter=arrAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                var x = arrayData1[position]
                Toast.makeText(applicationContext, "Char : "+arrayData1[position], Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }

    fun getCredit(char:String): Int {
        var credit=0
        if (char=="2"){
            credit=2
        }else if(char=="3"){
            credit= 3
        }else if(char=="4"){
            credit= 3
         }else{
            credit= 1
        }
        return credit

    }*/




}
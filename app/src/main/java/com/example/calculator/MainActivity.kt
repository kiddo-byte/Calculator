package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var display_answer:TextView
    private lateinit var edtfirst:EditText
    private lateinit var edtsecond:EditText
    private lateinit var add_button:Button
    private lateinit var multiply_button:Button
    private lateinit var dvd_button:Button
    private lateinit var sbt_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        display_answer = findViewById(R.id.txtdisplay)
        edtfirst = findViewById(R.id.numberone)
        edtsecond = findViewById(R.id.numbertwo)
        add_button = findViewById(R.id.btnadd)
        multiply_button = findViewById(R.id.btnmultiply)
        dvd_button = findViewById(R.id.btndvd)
        sbt_button = findViewById(R.id.btnsbt)

        add_button.setOnClickListener {

            var first_num = edtfirst.text.toString().trim()
            var second_num = edtsecond.text.toString().trim()

            if(first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            } else{

                Toast.makeText(this,"Adding...", Toast.LENGTH_SHORT).show()

                var answer = first_num.toDouble() + second_num.toDouble()
                display_answer.text = answer.toString()
            }
        }

        multiply_button.setOnClickListener {

            var first_num = edtfirst.text.toString().trim()
            var second_num = edtsecond.text.toString().trim()

            if(first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            } else{

                Toast.makeText(this,"Multiplying...", Toast.LENGTH_SHORT).show()

                var answer = first_num.toDouble() * second_num.toDouble()
                display_answer.text = answer.toString()
            }

        }

        dvd_button.setOnClickListener {

            var first_num = edtfirst.text.toString().trim()
            var second_num = edtsecond.text.toString().trim()

            if(first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            } else{

                Toast.makeText(this,"Dividing...", Toast.LENGTH_SHORT).show()

                var answer = first_num.toDouble() / second_num.toDouble()
                display_answer.text = answer.toString()
            }
        }

        sbt_button.setOnClickListener {
            var first_num = edtfirst.text.toString().trim()
            var second_num = edtsecond.text.toString().trim()

            if(first_num.isEmpty() || second_num.isEmpty()) {

                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            } else{

                Toast.makeText(this,"Subtracting...", Toast.LENGTH_SHORT).show()

                var answer = first_num.toDouble() - second_num.toDouble()
                display_answer.text = answer.toString()
            }
        }
    }
}
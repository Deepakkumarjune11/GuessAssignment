package com.example.myassignmentguess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val num:Int=700

        val guess=findViewById<TextInputLayout>(R.id.t1)?.editText?.text
        findViewById<TextView>(R.id.a1).setOnClickListener()
        {
            if(guess.toString().toInt()==num)
            {
                findViewById<TextView>(R.id.a4).setText("You are right")
            }
            else if(guess.toString().toInt()>num)
            {
                findViewById<TextView>(R.id.a4).setText("No :) My number is Smaller")
            }
            else
            {

                findViewById<TextView>(R.id.a4).setText("No :) My number is Bigger")

            }



        }


    }
}



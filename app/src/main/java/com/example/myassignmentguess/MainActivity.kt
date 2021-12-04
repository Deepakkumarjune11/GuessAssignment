package com.example.myassignmentguess

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val correct=Intent(this,EndGameActivity::class.java)
        val wrong=Intent(this,WrongActivity::class.java)
        val  crct=Intent(this,MainActivity::class.java)


        var count=0
        val num:Int=700

        val guess=findViewById<TextInputLayout>(R.id.t1)?.editText?.text
        findViewById<TextView>(R.id.a1).setOnClickListener()
        {
            count += 1

            if(guess.toString().toInt()==num && count<=12)
            {
               // findViewById<TextView>(R.id.a4).setText("You are right")
startActivity(correct)


            }
             else if(guess.toString().toInt()!=num && count<=12)
            {

                findViewById<TextView>(R.id.a4).setText("You haven't yet find the answer")

            }


            else
            {
                startActivity(wrong)
            }








        }


    }
}



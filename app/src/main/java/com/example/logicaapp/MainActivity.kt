package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Omar Mulla Ibrahim
 * Student Nr 500766035
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener { (checkAnswer()) }

    }

    private fun checkAnswer() {
        var result = 0;
        val answer1 = answer1.text.toString();
        val answer2 = answer2.text.toString();
        val answer3 = answer3.text.toString();
        val answer4 = answer4.text.toString();

        if (answer1 == getString(R.string.t)) {
            result++;


        }

        if (answer2 == getString(R.string.f)) {
            result++


        }

        if (answer3 == getString(R.string.f)) {
            result++


        }

        if (answer4 == getString(R.string.f)) {
            result++

        }
        Toast.makeText(
            this, getString(R.string.Correct, result),
            Toast.LENGTH_LONG
        ).show();


    }


}

package com.example.trafficlight

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redCircle.isEnabled = false
        yellowCircle.isEnabled = false
        greenCircle.isEnabled = false
    }

    fun changeToRed (view: View) {
//        redCircle.setBackgroundResource(R.drawable.red)
//        yellowCircle?.setBackgroundResource(R.drawable.dark_circle)
//        greenCircle?.setBackgroundResource(R.drawable.dark_circle)
        redCircle.isEnabled = true;
        yellowCircle.isEnabled = false;
        greenCircle.isEnabled = false;
    }

    fun changeToYellow (view: View) {
        redCircle.isEnabled = false;
        yellowCircle.isEnabled = true;
        greenCircle.isEnabled = false;

    }

    fun changeToGreen (view: View) {
        redCircle.isEnabled = false;
        yellowCircle.isEnabled = false;
        greenCircle.isEnabled = true;
    }
}

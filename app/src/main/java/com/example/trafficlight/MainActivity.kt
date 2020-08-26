package com.example.trafficlight

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeToRed (view: View) {
        redCircle.setBackgroundResource(R.drawable.red)
        yellowCircle?.setBackgroundResource(R.drawable.dark_circle)
        greenCircle?.setBackgroundResource(R.drawable.dark_circle)

    }

    fun changeToYellow (view: View) {
        yellowCircle?.setBackgroundResource(R.drawable.yellow)
        redCircle?.setBackgroundResource(R.drawable.dark_circle)
        greenCircle?.setBackgroundResource(R.drawable.dark_circle)

    }

    fun changeToGreen (view: View) {
        greenCircle?.setBackgroundResource(R.drawable.green)
        yellowCircle?.setBackgroundResource(R.drawable.dark_circle)
        redCircle?.setBackgroundResource(R.drawable.dark_circle)

    }
}

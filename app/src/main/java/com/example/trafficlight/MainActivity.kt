package com.example.trafficlight

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout

class MainActivity : Activity() {
    var redLigth: LinearLayout? = null
    var greenLigth: LinearLayout? = null
    var yellowLigth: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redLigth = findViewById(R.id.redCircle);
        yellowLigth = findViewById(R.id.yellowCircle);
        greenLigth = findViewById(R.id.greenCircle);
    }

    fun changeToRed (view: View) {
        redLigth?.setBackgroundResource(R.drawable.red)
        yellowLigth?.setBackgroundResource(R.drawable.dark_circle)
        greenLigth?.setBackgroundResource(R.drawable.dark_circle)

    }

    fun changeToYellow (view: View) {
        yellowLigth?.setBackgroundResource(R.drawable.yellow)
        redLigth?.setBackgroundResource(R.drawable.dark_circle)
        greenLigth?.setBackgroundResource(R.drawable.dark_circle)

    }

    fun changeToGreen (view: View) {
        greenLigth?.setBackgroundResource(R.drawable.green)
        yellowLigth?.setBackgroundResource(R.drawable.dark_circle)
        redLigth?.setBackgroundResource(R.drawable.dark_circle)

    }
}

package edu.neo.dicerollers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var greeting : TextView
    lateinit var diceImage : ImageView
    var counting = 2020

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Lets Roll!"
        greeting = findViewById(R.id.tw_greeting)
        rollButton.setOnClickListener {
            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {

        val drawableResource = when (Random.nextInt( 6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> "ups, me rompi"
        }
        diceImage.setImageResource(drawableResource as Int)
    }

    fun aCupOfTea(view: View) {
        greeting.text = "Hi Josmary! Welcome to our team from $counting"
        Toast.makeText(this, "Do you want a cup of tea?", Toast.LENGTH_SHORT).show()
        counting ++
    }
}

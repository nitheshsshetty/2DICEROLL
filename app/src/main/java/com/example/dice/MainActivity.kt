package com.example.dice

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lateinit var d1:ImageView
        lateinit var d2:ImageView
        d1 = findViewById(R.id.dice_image1)
        d2 = findViewById(R.id.dice_image2)
        val rolldice:Button=findViewById(R.id.button)
        val reset:Button=findViewById(R.id.button1)
        reset.setOnClickListener{resetfunc(d1,d2)}
        rolldice.setOnClickListener{roll(d1,d2)}


    }
    private fun resetfunc(d1:ImageView,d2:ImageView){
        d1.setImageResource(R.drawable.empty_dice)
        d2.setImageResource(R.drawable.empty_dice)

    }
    private fun roll(d1: ImageView, d2: ImageView) {
        d1.setImageResource(rolldice())
        d2.setImageResource(rolldice())
    }

    private fun rolldice():Int {
        Toast.makeText(this, "Dice rolled..!!", Toast.LENGTH_SHORT).show()
        var num = (1..6).random()

        return when(num)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

    }

}


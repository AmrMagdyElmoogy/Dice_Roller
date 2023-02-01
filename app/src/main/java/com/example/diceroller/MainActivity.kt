package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var button : Button
    private lateinit var image : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
        button = binding.ButtonRoller
        image = binding.ImageDice

        button.setOnClickListener{
            Toast.makeText(this,"Button Cliked", Toast.LENGTH_SHORT).show()
            rollDice(image)

        }
    }


    private fun rollDice(image: ImageView) {

        val dice = Random().nextInt(7)
        val drawableResource = when(dice){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        image.setImageResource(drawableResource)
    }
}
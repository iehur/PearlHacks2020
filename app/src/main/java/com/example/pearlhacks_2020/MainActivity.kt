package com.example.pearlhacks_2020

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sayHelloWorld = true

        //buttons
        val button = findViewById<Button>(R.id.button)
        val navButton = findViewById<Button>(R.id.navigate_button)

        //textviews
        val textView = findViewById<TextView>(R.id.hello_world_tv)

        button.setOnClickListener {
            sayHelloWorld = !sayHelloWorld
            textView.text = if (!sayHelloWorld) {
                getString(R.string.goodbye_world)
            } else {
                getString(R.string.hello_world)
            }
        }

        navButton.setOnClickListener {
            startActivity(Intent(this, NewActivity::class.java))
        }
    }
}

package com.example.juegoahorcadoblp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun play(view: View) {
        val objInt: Intent = Intent(view.context, GameActivity2::class.java)
        startActivity(objInt)
    }

}

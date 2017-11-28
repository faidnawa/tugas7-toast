package com.example.faidnawa.toast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToast.setOnClickListener {
            Toast.makeText(this, "ini Toast loh !!", Toast.LENGTH_SHORT).show()
        }

        btnReset.setOnClickListener{
            count = 0
            nilai.text = count.toString()
        }

        btnCount.setOnClickListener {
            count++
            nilai.text = count.toString()
        }
    }
}
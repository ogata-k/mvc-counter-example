package com.ogata_k.count_app_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vm = ViewModelProvider(this).get(CounterViewModel::class.java)
        val controller = CounterController(vm)

        // set view
        val countTextView = findViewById<TextView>(R.id.countText)
        vm.count.observe(this) {
            countTextView.text = it.toString()
        }

        val countUpButton = findViewById<FloatingActionButton>(R.id.countupButton)
        countUpButton.setOnClickListener{
            controller.countUp()
        }
    }
}
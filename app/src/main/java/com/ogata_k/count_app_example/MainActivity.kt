package com.ogata_k.count_app_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), ControllerView<CounterViewModel, CounterController> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    override fun controller(): CounterController {
        val vm = ViewModelProvider(this).get(CounterViewModel::class.java)
        return CounterController(vm)
    }

    private fun setupView() {
        val controller = controller()
        val vm = controller.vm

        val countTextView = findViewById<TextView>(R.id.countText)
        vm.count.observe(this) {
            countTextView.text = it.toString()
        }

        val countUpButton = findViewById<FloatingActionButton>(R.id.countupButton)
        countUpButton.setOnClickListener {
            controller.countUp()
        }
    }
}
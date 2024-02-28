package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practical1.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClose.setOnClickListener { finish() }

        val name = intent.getStringExtra("name") ?: ""
        val age = intent.getIntExtra("age",0)
        binding.txtOutput.text = """
            The output is:
            Name = $name
            Age = $age
        """.trimIndent()
    }
}
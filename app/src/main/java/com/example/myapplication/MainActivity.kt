package com.example.studycircle

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    private lateinit var topicSpinner: Spinner
    private lateinit var findButton: Button
    private lateinit var resultText: TextView

    private val topics = arrayOf("Data Structures", "OS", "DAA", "DBMS", "Networks", "AI", "Android")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        topicSpinner = findViewById(R.id.topicSpinner)
        findButton = findViewById(R.id.findButton)
        resultText = findViewById(R.id.resultText)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, topics)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        topicSpinner.adapter = adapter

        findButton.setOnClickListener {
            val selectedTopic = topicSpinner.selectedItem.toString()
            simulateMatch(selectedTopic)
        }
    }

    private fun simulateMatch(topic: String) {
        // Placeholder logic
        val mockPartner = listOf("Aman", "Divya", "Rahul", "Sneha", "Mehul").random()
        resultText.text = "You matched with $mockPartner for topic: $topic"
    }
}

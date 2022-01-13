package ru.spbstu.lab3task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityAbout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)//
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
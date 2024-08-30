package com.example.demo_for_jenkin_and_unit_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: TEST log added")
        println("help me log");
        Log.d(TAG, "onCreate: test1")
        Log.e(TAG, "onCreate: Error log test" )
        Log.i(TAG, "onCreate: Info log test")
        Log.e(TAG, "onCreate: Error 2 test", )

    }
}
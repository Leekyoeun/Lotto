package com.emiirm.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class NameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        Toast.makeText(applicationContext,"NameActivity입니다", Toast.LENGTH_LONG).show()
    }
}

package com.firdy.simpledatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.firdy.simpledatabinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Mendeklarasi reference variable untung binding object
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Karna menggunakan Binding, kita tidak lagi menggunakan setContentView()
        //setContentView(R.layout.activity_main)

        // setContentView menggunakan data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSubmit.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {

        // Contoh Menggunakan Data Binding
        binding.apply {
            txtShowName.text = "Hello, ${txtName.text}"
        }

        // Contoh Tidak Menggunakan Data Binding
        //val txtName = findViewById<EditText>(R.id.txt_name)
        //val txtShowName = findViewById<TextView>(R.id.txt_show_name)

        //txtShowName.text = "Hello, ${txtName.text}"
    }
}
package com.duygu.listviewexample

import android.graphics.ColorSpace
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meyveler = listOf("Elma", "Armut", "Muz", "Kivi", "Çilek", "Karpuz", "Kavun", "Ananas", "Kiraz", "Dut")

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, meyveler)

        list_view.adapter = adapter

        list_view.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val secilenMeyve = parent.getItemAtPosition(position) as String

            Toast.makeText(this@MainActivity, "Seçilen meyve: $secilenMeyve", Toast.LENGTH_SHORT).show()
        }

    }
}

package com.mercadopago.kotlin_examples

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var myLayoutManager: LinearLayoutManager
    private var myAdapter: Adapter = Adapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myLayoutManager = LinearLayoutManager(this)
        recycler_view.apply {
            layoutManager = myLayoutManager
            adapter = myAdapter
        }
    }
}

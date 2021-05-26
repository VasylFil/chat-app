package com.example.aiogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

const val DATA = "com.example.aiogram.DATA"

open class MainActivity : AppCompatActivity() {

    private lateinit var chatAdapter: ChatRecyclerAdapter
    private var items: List<ChatData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet(){
        val data = DataSource.createDataSet()
        chatAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val topSpacingDecorator = TopSpacingItemDecoration(4)
            addItemDecoration(topSpacingDecorator)
            chatAdapter = ChatRecyclerAdapter(this@MainActivity)
            adapter = chatAdapter
        }
    }
}




























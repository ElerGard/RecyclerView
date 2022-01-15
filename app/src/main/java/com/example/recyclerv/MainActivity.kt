package com.example.recyclerv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val list = listOf(
            ElementOfList("Human", "it's just a human", R.drawable.avatar_1),
            ElementOfList("Wall", "Just a wall", R.drawable.ic_launcher_background),
            ElementOfList("Android head", "Cute face", R.drawable.ic_launcher_foreground)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.ShowingList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(list)
    }
}
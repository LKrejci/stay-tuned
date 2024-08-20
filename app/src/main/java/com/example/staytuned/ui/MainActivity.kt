package com.example.staytuned.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.staytuned.data.model.News
import com.example.staytuned.databinding.NewsListActivityBinding
import com.example.staytuned.ui.newsList.NewsListAdapter

class MainActivity : ComponentActivity() {

    private lateinit var binding: NewsListActivityBinding
    private lateinit var adapter: NewsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NewsListActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newsListRecyclerview.layoutManager = LinearLayoutManager(this)
        adapter = NewsListAdapter(news())
        binding.newsListRecyclerview.adapter = adapter
    }

    private fun news(): List<News> {
        return listOf()
    }
}
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
        return listOf(
            News(
                "Deamond usou cogumelo",
                "Esposo da Rainha Rhaenyra passa 50 episódios perdido no castelo"
            ),
            News(
                "Mãe do rei arrependida",
                "Depois de copular com o mais novo Mão do Rei, Alicent é demitida da corte do rei. O rei não gostou do seu novo padrasto!"
            ),
            News(
                "Aemond Estética",
                "Além de suplente do rei, Aemond lança sua primeira clinica de estética labial"
            )
        )
    }
}
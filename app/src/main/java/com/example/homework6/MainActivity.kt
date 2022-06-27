package com.example.homework6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework6.databinding.ActivityMainBinding
import com.example.homework6.databinding.ItemGameBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var gameAdapter: GameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter();
    }

    private fun initAdapter() {
        val list = arrayListOf<GameModel>()
        list.add(GameModel("#004", charmander))
        list.add(GameModel("#025", pikachu))
        list.add(GameModel("#004", mew))
        list.add(GameModel("#001", bulbasaur))
        list.add(GameModel("#012", butterfree))
        list.add(GameModel("#007", squirtle))
        list.add(GameModel("#004", aron))
        list.add(GameModel("#132", ditto))
        list.add(GameModel("#092", gastly))

        gameAdapter = GameAdapter(list)
        binding.recyclerView.adapter = gameAdapter
    }
}
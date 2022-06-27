package com.example.homework6

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.ColorInt
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.homework6.databinding.ItemGameBinding

class GameAdapter(val list: ArrayList<GameModel>) :
    RecyclerView.Adapter<GameAdapter.PokemonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding = ItemGameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PokemonViewHolder(binding)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PokemonViewHolder(val binding: ItemGameBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @RequiresApi(Build.VERSION_CODES.M)
        fun onBind(model: GameModel) {
            binding.textView.text = model.name
            binding.text.text = model.number
            when (model.name) {
                pikachu -> {
                    val color = itemView.context.getColor(R.color.img_one)
                    updateColor(color)
                    binding.img.load(R.drawable.img_one)
                }
                charmander -> {
                    val color = itemView.context.getColor(R.color.img_two)
                    updateColor(color)
                    binding.img.load(R.drawable.img_two)
                }
                mew -> {
                    val color = itemView.context.getColor(R.color.img_three)
                    updateColor(color)
                    binding.img.load(R.drawable.img_three)
                }
                squirtle -> {
                    val color = itemView.context.getColor(R.color.img_four)
                    updateColor(color)
                    binding.img.load(R.drawable.img_four)
                }
                bulbasaur -> {
                    val color = itemView.context.getColor(R.color.img_five)
                    updateColor(color)
                    binding.img.load(R.drawable.img_five)
                }
                aron -> {
                    val color = itemView.context.getColor(R.color.img_six)
                    updateColor(color)
                    binding.img.load(R.drawable.img_six)
                }
                ditto -> {
                    val color = itemView.context.getColor(R.color.img_seven)
                    updateColor(color)
                    binding.img.load(R.drawable.img_seven)
                }
                butterfree -> {
                    val color = itemView.context.getColor(R.color.img_ieght)
                    updateColor(color)
                    binding.img.load(R.drawable.img_ieght)
                }
                gastly -> {
                    val color = itemView.context.getColor(R.color.img_nine)
                    updateColor(color)
                    binding.img.load(R.drawable.img_nine)
                }
            }
        }

        private fun updateColor(@ColorInt color: Int) {
            val drawable = itemView.background as GradientDrawable
            drawable.mutate()
            drawable.setStroke(2, color)

            val textDrawable = binding.textView.background as GradientDrawable
            textDrawable.mutate()
            textDrawable.setTint(color)

            val textNumber = binding.text
            textNumber.setTextColor(color)
        }
    }
}



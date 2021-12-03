package com.bignerdranch.android.sampleapplicationforbottomnavigation

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.example_item.view.*

class ExampleAdapter : RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        // most confusing but always the same formatting
        val  itemView = LayoutInflater.from(parent.context).inflate(R.layout.example_item,
        parent, false)
        return ExampleViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    // we want to hold all 3 views text, text and image
    class ExampleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val textView1: TextView = itemView.findViewById(R.id.textview1)
        val textView2: TextView = itemView.findViewById(R.id.textview2)

    }

}
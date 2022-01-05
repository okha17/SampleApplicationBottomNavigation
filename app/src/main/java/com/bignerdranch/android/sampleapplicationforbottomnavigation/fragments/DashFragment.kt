package com.bignerdranch.android.sampleapplicationforbottomnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bignerdranch.android.sampleapplicationforbottomnavigation.ExampleAdapter
import com.bignerdranch.android.sampleapplicationforbottomnavigation.ExampleItem
import com.bignerdranch.android.sampleapplicationforbottomnavigation.R
import kotlinx.android.synthetic.main.fragment_dash.*


class DashFragment : Fragment() {

    private fun generateDummyList(size: Int): List<ExampleItem> {

        val list = ArrayList<ExampleItem>()

        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_quick_pc
                1 -> R.drawable.ic_quiz
                else -> R.drawable.ic_quick_pc
            }

            val item = ExampleItem(drawable, "Item $i", "Line 2")
            list += item
        }

        return list
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dash, container, false)
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        val exampleList = generateDummyList(500)

        recycler_view.setHasFixedSize(true)
        recycler_view.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            this.layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            this.adapter = ExampleAdapter(exampleList)
        }
    }

}


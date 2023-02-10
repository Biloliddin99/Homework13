package com.bkm.homework13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bkm.homework13.adapters.StaggerAdapter
import com.bkm.homework13.databinding.ActivityHomework3Binding
import com.bkm.homework13.models.User3

class Homework3 : AppCompatActivity() {

    private var myList = ArrayList<User3>()
    private lateinit var staggerAdapter: StaggerAdapter

    private lateinit var binding: ActivityHomework3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.staggerRv.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        staggerAdapter = StaggerAdapter(this, myList)
        binding.staggerRv.adapter = staggerAdapter

        addData()
    }

    private fun addData() {
        val movie1 = User3(R.drawable.avangers, "Avengers")
        myList.add(movie1)

        val movie2 = User3(R.drawable.widow, "Black Widow")
        myList.add(movie2)

        val movie3 = User3(R.drawable.captian, "Captain America")
        myList.add(movie3)

        val movie4 = User3(R.drawable.ant, "Ant-Man")
        myList.add(movie4)

        val movie5 = User3(R.drawable.guar2, "Guardians of the galaxy")
        myList.add(movie5)

        val movie6 = User3(R.drawable.hulk2, "Hulk")
        myList.add(movie6)

        val movie7 = User3(R.drawable.infi, "Avengers 2")
        myList.add(movie7)

        val movie8 = User3(R.drawable.iron, "Iron Man")
        myList.add(movie8)

        val movie9 = User3(R.drawable.spider, "Spider Man")
        myList.add(movie9)

        val movie10 = User3(R.drawable.wanda, "Wanda Vision")
        myList.add(movie10)
    }
}
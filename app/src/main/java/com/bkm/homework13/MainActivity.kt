package com.bkm.homework13

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.LinearLayoutManager
import com.bkm.homework13.adapters.MyAdapter
import com.bkm.homework13.databinding.ActivityMainBinding
import com.bkm.homework13.models.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = ArrayList<User>()
    lateinit var imageId: Array<Int>
    lateinit var nameId: Array<String>
    lateinit var viewId: Array<String>
    lateinit var dateId: Array<String>
    private lateinit var myAdapter: MyAdapter

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        myAdapter = MyAdapter(this, list)
        addData()
        binding.myRv.layoutManager = LinearLayoutManager(this)
        binding.myRv.setHasFixedSize(true)
        list = arrayListOf()
        getUserData()

    }

    @SuppressLint("NotifyDataSetChanged")
    private fun getUserData() {
        for (i in imageId.indices) {
            val user = User(imageId[i], nameId[i], viewId[i], dateId[i])
            list.add(user)
            myAdapter.notifyDataSetChanged()
        }
        binding.myRv.adapter = MyAdapter(this, list)
    }


    private fun addData() {
        imageId = arrayOf(
            R.drawable.avangers,
            R.drawable.captian,
            R.drawable.doc,
            R.drawable.guar2,
            R.drawable.hulk2,
            R.drawable.spider,
            R.drawable.iron,
            R.drawable.thor,
            R.drawable.wanda,
            R.drawable.infi,
            R.drawable.black,

            )

        nameId = arrayOf(
            "Avengers",
            "Captain America",
            "Doctor Strange",
            "Guardians of the Galaxy",
            "Hulk",
            "Spider Man - No way home",
            "Iron Man",
            "Thor 3",
            "Wanda Vision",
            "Avengers - Infinity",
            "Black Panther",

            )

        viewId = arrayOf(
            "Views: 500",
            "Views: 400",
            "Views: 600",
            "Views: 550",
            "Views: 450",
            "Views: 620",
            "Views: 590",
            "Views: 480",
            "Views: 580",
            "Views: 620",
            "Views: 480"
        )

        dateId = arrayOf(
            "Release Date: 24 April 2018",
            "Release Date: 12 March 2019",
            "Release Date: 25 November 2021",
            "Release Date: 13 October 2020",
            "Release Date: 16 January 2018",
            "Release Date: 18 December 2016",
            "Release Date: 9 May 2017",
            "Release Date: 11 March 2022",
            "Release Date: 3 July 2020",
            "Release Date: 7 August 2018",
            "Release Date: 19 June 2015"
        )
    }


}
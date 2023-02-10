package com.bkm.homework13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bkm.homework13.adapters.GridAdapter
import com.bkm.homework13.databinding.ActivityHomework2Binding
import com.bkm.homework13.models.User2

class Homework2 : AppCompatActivity() {
    private var list2 = ArrayList<User2>()
     private lateinit var imageId:Array<Int>
    private lateinit var gridAdapter: GridAdapter
    private lateinit var binding: ActivityHomework2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomework2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        gridAdapter = GridAdapter(this,list2)
        addData()
        binding.recycle2.adapter = gridAdapter
        list2 = arrayListOf()
        getData()



    }

    private fun getData(){
        for (i in imageId.indices) {
            val user2 = User2(imageId[i])
            list2.add(user2)
        }
        binding.recycle2.adapter = GridAdapter(this,list2)
    }

    private fun addData(){
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
            R.drawable.widow
        )
    }
}
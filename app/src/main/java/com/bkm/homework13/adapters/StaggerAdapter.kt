package com.bkm.homework13.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bkm.homework13.R
import com.bkm.homework13.databinding.ItemStaggerBinding
import com.bkm.homework13.models.User3

class StaggerAdapter(private val context: Context, private val myList: ArrayList<User3>) :
    RecyclerView.Adapter<StaggerAdapter.Vh>() {

    inner class Vh(private val itemStaggerBinding: ItemStaggerBinding) :
        RecyclerView.ViewHolder(itemStaggerBinding.root) {
        fun onBind(user3: User3) {
            itemStaggerBinding.imageStag.setImageResource(user3.image)
            itemStaggerBinding.tvStag.text = user3.name
            val animation = AnimationUtils.loadAnimation(context, R.anim.anim)
            itemStaggerBinding.root.startAnimation(animation)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StaggerAdapter.Vh {

        return Vh(ItemStaggerBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        val list = myList[position]
        holder.onBind(myList[position])
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "" + list.name, Toast.LENGTH_SHORT).show()
        }
//        holder.itemView.animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim3)
    }

    override fun getItemCount(): Int {
        return myList.size
    }

}
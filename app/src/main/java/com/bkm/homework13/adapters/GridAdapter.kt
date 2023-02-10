package com.bkm.homework13.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bkm.homework13.R
import com.bkm.homework13.databinding.GridItemBinding
import com.bkm.homework13.models.User2

class GridAdapter(val context: Context,private val list: ArrayList<User2>):RecyclerView.Adapter<GridAdapter.Vh>(){
    inner class Vh(private val gridItemBinding: GridItemBinding):RecyclerView.ViewHolder(gridItemBinding.root){
        fun onBind(user2: User2){
            gridItemBinding.rvImage.setImageResource(user2.image)
            val animation = AnimationUtils.loadAnimation(context,R.anim.anim)
            gridItemBinding.root.startAnimation(animation)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(GridItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
//        holder.itemView.animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim2)
    }
}
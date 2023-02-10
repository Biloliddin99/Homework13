package com.bkm.homework13.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.bkm.homework13.R
import com.bkm.homework13.databinding.ItemRvBinding
import com.bkm.homework13.models.User
import org.w3c.dom.Text

class MyAdapter(val context:Context ,private val list: ArrayList<User>) : RecyclerView.Adapter<MyAdapter.Vh>() {

    inner class Vh(private val itemRvBinding: ItemRvBinding) :
        RecyclerView.ViewHolder(itemRvBinding.root) {

        fun onBind(user: User) {
            itemRvBinding.rvImage.setImageResource(user.titleImage)
            itemRvBinding.txtName.text = user.name
            itemRvBinding.txtView.text = user.views
            itemRvBinding.txtDate.text  = user.date
            val animation = AnimationUtils.loadAnimation(context,R.anim.anim)
            itemRvBinding.root.startAnimation(animation)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
//        holder.itemView.animation =
//            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim)
    }


}
package com.ragdroid.dahaka.activity.items.list

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ragdroid.dahaka.R
import com.ragdroid.dahaka.databinding.ItemHeldBinding

import java.util.ArrayList

import javax.inject.Inject

/**
 * Created by garimajain on 19/08/17.
 */

class ItemsAdapter @Inject
constructor() : RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>() {

    internal var items: MutableList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_held, parent, false)
        return ItemsViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        val move = items[position]
        holder.dataBinding.move = move
    }

    fun updateList(items: List<String>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ItemsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val dataBinding: ItemHeldBinding

        init {
            dataBinding = DataBindingUtil.bind(itemView)
        }
    }

}

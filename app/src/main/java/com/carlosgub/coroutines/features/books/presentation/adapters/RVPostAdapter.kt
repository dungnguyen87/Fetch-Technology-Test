package com.carlosgub.coroutines.features.books.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.carlosgub.coroutines.R
import com.carlosgub.coroutines.features.books.presentation.model.PostVM
import kotlinx.android.synthetic.main.post_item.view.*

class RVPostAdapter : RecyclerView.Adapter<RVPostAdapter.ViewHolder>() {

    private val mList: MutableList<PostVM> = mutableListOf()
    private var mListener: Listener? = null

    fun add(lstPostVM: PostVM) {
        mList.add(lstPostVM)
        notifyItemInserted(this.itemCount)
    }

    fun setListener(listener: Listener) {
        mListener = listener
    }

    interface Listener {
        fun onPostClicked(id: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.post_item, parent, false)
    )

    override fun getItemCount() = mList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(mList[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(postVM: PostVM) {
            itemView.tvPostItemTitle.text = postVM.base
            itemView.tvPostItemBuyPrice.text = "Buy price:" + postVM.buy_price
            itemView.tvPostItemSellPrice.text = "Sell price:" + postVM.sell_price
            Glide.with(itemView).load(postVM.icon).skipMemoryCache(true).into(itemView.icon)
            itemView.cvPostItem.setOnClickListener {
//                mListener?.onPostClicked(postVM.id ?: 1)
            }
        }
    }
}
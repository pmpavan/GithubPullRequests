package com.pmpavan.githubpullrequests.viewmodel

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.pmpavan.githubpullrequests.R
import com.pmpavan.githubpullrequests.databinding.PullRequestListItemBinding
import com.pmpavan.githubpullrequests.viewmodel.uistate.PullRequestListItemUiState
import javax.inject.Inject

class PullRequestListAdapter @Inject constructor(val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    private var items: MutableList<PullRequestListItemUiState> = mutableListOf()

    var handler: PullRequestListItemUiState.PullRequestItemClickHandler? = null


    fun setItems(items: MutableList<PullRequestListItemUiState>) {
        this.items = items
        notifyDataSetChanged()
    }

    fun getItem(position: Int): PullRequestListItemUiState {
        return items[position]
    }

    fun addAll(items: MutableList<PullRequestListItemUiState>) {
        this.items.addAll(items)
    }

    fun clear() {
        items.clear()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return PullRequestViewHolder.create(LayoutInflater.from(parent.context), parent)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = items[position]
        (holder as PullRequestViewHolder).bind(model)
        holder.binding.root.setOnClickListener { _ ->
            if (handler != null)
                handler!!.onItemClick(position, model)
        }
    }

    internal class PullRequestViewHolder(val binding: PullRequestListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: PullRequestListItemUiState) {
            binding.vm = item
            binding.executePendingBindings()
        }

        companion object {

            fun create(inflater: LayoutInflater, parent: ViewGroup): PullRequestViewHolder {
                val binding: PullRequestListItemBinding = DataBindingUtil.inflate(inflater, R.layout.pull_request_list_item, parent, false)
                return PullRequestViewHolder(binding)
            }
        }
    }
}
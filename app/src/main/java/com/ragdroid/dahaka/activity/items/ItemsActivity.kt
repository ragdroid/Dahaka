package com.ragdroid.dahaka.activity.items

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar

import com.ragdroid.dahaka.R
import com.ragdroid.dahaka.activity.items.list.ItemsAdapter
import com.ragdroid.dahaka.databinding.ActivityItemsBinding
import com.ragdroid.dahaka.user.BaseUserActivity
import com.ragdroid.dahaka.user.UserComponent

import javax.inject.Inject

/**
 * Created by garimajain on 19/08/17.
 */

class ItemsActivity : BaseUserActivity<ItemsContract.Presenter, ItemsContract.View>(), ItemsContract.View {

    override fun getView(): ItemsContract.View = this

    private var itemsComponent: ItemsComponent? = null
    @Inject lateinit var adapter: ItemsAdapter
    @Inject lateinit var linearLayoutManager: LinearLayoutManager
    @Inject lateinit var dividerItemDecoration: DividerItemDecoration
    private lateinit var binding: ActivityItemsBinding

    override fun inject(userComponent: UserComponent) {
        itemsComponent = userComponent.itemsComponentBuilder()
                .activity(this)
                .build()
        itemsComponent!!.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_items)
        super.onCreate(savedInstanceState)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        toolbar.setNavigationOnClickListener { view -> finish() }
    }

    override fun showModel(model: ItemsModel) {
        binding.itemsRecyclerView.adapter = adapter
        binding.itemsRecyclerView.addItemDecoration(dividerItemDecoration)
        binding.itemsRecyclerView.layoutManager = linearLayoutManager
        adapter.updateList(model.items)
    }
}

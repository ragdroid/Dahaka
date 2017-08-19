package com.ragdroid.dahaka.activity.items;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;

import com.ragdroid.dahaka.R;
import com.ragdroid.dahaka.activity.items.list.ItemsAdapter;
import com.ragdroid.dahaka.databinding.ActivityItemsBinding;
import com.ragdroid.dahaka.user.BaseUserActivity;
import com.ragdroid.dahaka.user.UserComponent;

import javax.inject.Inject;

/**
 * Created by garimajain on 19/08/17.
 */

public class ItemsActivity extends BaseUserActivity<ItemsContract.Presenter> implements ItemsContract.View {

    private ItemsComponent itemsComponent;
    @Inject ItemsAdapter adapter;
    @Inject LinearLayoutManager linearLayoutManager;
    @Inject DividerItemDecoration dividerItemDecoration;
    private ActivityItemsBinding binding;

    @Override
    protected void inject(UserComponent userComponent) {
        itemsComponent = userComponent.itemsComponentBuilder()
                .activity(this)
                .build();
        itemsComponent.inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_items);
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setNavigationOnClickListener(view -> finish());
    }

    @Override
    public void showModel(ItemsModel model) {
        binding.itemsRecyclerView.setAdapter(adapter);
        binding.itemsRecyclerView.addItemDecoration(dividerItemDecoration);
        binding.itemsRecyclerView.setLayoutManager(linearLayoutManager);
        adapter.updateList(model.items);
    }
}

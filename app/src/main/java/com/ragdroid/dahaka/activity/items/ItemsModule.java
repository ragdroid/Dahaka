package com.ragdroid.dahaka.activity.items;

import android.support.v7.widget.LinearLayoutManager;

import com.ragdroid.dahaka.activity.items.list.ItemsAdapter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by garimajain on 17/08/17.
 */
@Module
public class ItemsModule {

    @Provides
    public ItemsContract.Presenter provideHomePresenter(ItemsPresenter presenter) {
        return presenter;
    }

    @Provides
    public ItemsAdapter provideItemsAdapter() {
        return new ItemsAdapter();
    }

    @Provides
    public LinearLayoutManager provideLayoutManager(ItemsActivity activity) {
        return new LinearLayoutManager(activity);
    }

}

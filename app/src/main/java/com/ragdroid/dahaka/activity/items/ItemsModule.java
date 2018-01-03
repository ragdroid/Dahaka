package com.ragdroid.dahaka.activity.items;

import android.support.v7.widget.DividerItemDecoration;
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
    static ItemsContract.Presenter provideHomePresenter(ItemsPresenter presenter) {
        return presenter;
    }

    @Provides
    static ItemsAdapter provideItemsAdapter() {
        return new ItemsAdapter();
    }

    @Provides
    static LinearLayoutManager provideLayoutManager(ItemsActivity activity) {
        return new LinearLayoutManager(activity);
    }

    @Provides
    static DividerItemDecoration provideDividerItemDecoration(ItemsActivity activity) {
        return new DividerItemDecoration(activity, DividerItemDecoration.VERTICAL);
    }

}

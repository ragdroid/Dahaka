package com.ragdroid.dahaka.activity.items

import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager

import com.ragdroid.dahaka.activity.items.list.ItemsAdapter

import dagger.Module
import dagger.Provides

/**
 * Created by garimajain on 17/08/17.
 */
@Module
class ItemsModule {

    @Provides
    fun provideHomePresenter(presenter: ItemsPresenter): ItemsContract.Presenter {
        return presenter
    }

    @Provides
    fun provideItemsAdapter(): ItemsAdapter {
        return ItemsAdapter()
    }

    @Provides
    fun provideLayoutManager(activity: ItemsActivity): LinearLayoutManager {
        return LinearLayoutManager(activity)
    }

    @Provides
    fun provideDividerItemDecoration(activity: ItemsActivity): DividerItemDecoration {
        return DividerItemDecoration(activity, DividerItemDecoration.VERTICAL)
    }

}

package com.ragdroid.dahaka.activity.items


import dagger.BindsInstance
import dagger.Subcomponent

/**
 * Created by garimajain on 17/08/17.
 */
@Subcomponent(modules = arrayOf(ItemsModule::class))
interface ItemsComponent {

    fun inject(itemsActivity: ItemsActivity)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun activity(homeActivity: ItemsActivity): ItemsComponent.Builder

        fun build(): ItemsComponent

    }
}

package com.ragdroid.dahaka.activity.items;



import com.ragdroid.dahaka.activity.ActivityScope;

import dagger.BindsInstance;
import dagger.Subcomponent;

/**
 * Created by garimajain on 17/08/17.
 */
@Subcomponent(modules = ItemsModule.class)
public interface ItemsComponent {

    void inject(ItemsActivity itemsActivity);

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        ItemsComponent.Builder activity(ItemsActivity homeActivity);
        ItemsComponent build();

    }
}

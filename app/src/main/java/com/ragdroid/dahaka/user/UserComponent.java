package com.ragdroid.dahaka.user;


import com.ragdroid.dahaka.api.entity.Pokemon;
import com.ragdroid.dahaka.app.AppComponent;
import com.ragdroid.dahaka.app.UserManager;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by garimajain on 13/08/17.
 */
@UserScope
@Component(dependencies = AppComponent.class,
        modules = {UserBindingModule.class, AndroidSupportInjectionModule.class})
public interface UserComponent extends AndroidInjector<DaggerApplication> {
    void inject(UserManager userManager);


    @Component.Builder
    interface Builder {

        Builder appComponent(AppComponent appComponent);

        UserComponent build();
        @BindsInstance
        Builder pokeMon(Pokemon pokemon);
    }

}

package com.ragdroid.dahaka.app;

import com.ragdroid.dahaka.util.BaseSchedulerProvider;

import org.mockito.Mockito;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.TestScheduler;

import static org.mockito.Mockito.when;

/**
 * Created by garimajain on 28/08/17.
 */
@Module
public class MockAppModule {

    @Singleton
    @Provides
    static TestScheduler provideTestScheduler() {
        return new TestScheduler();
    }

    @Provides
    @Singleton
    public static BaseSchedulerProvider provideBaseScheduler(TestScheduler testScheduler) {
        BaseSchedulerProvider schedulerProvider = Mockito.mock(BaseSchedulerProvider.class);
        when(schedulerProvider.computation()).thenReturn(testScheduler);
        when(schedulerProvider.io()).thenReturn(testScheduler);
        when(schedulerProvider.ui()).thenReturn(AndroidSchedulers.mainThread());
        return schedulerProvider;
    }

}

package com.ragdroid.dahaka.app;

import com.ragdroid.dahaka.app.UserManager;
import com.ragdroid.dahaka.util.BaseSchedulerProvider;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

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

    @Mock BaseSchedulerProvider schedulerProvider;
    private final TestScheduler testScheduler = new TestScheduler();

    @Singleton
    @Provides
    TestScheduler provideTestScheduler() {
        return testScheduler;
    }

    public MockAppModule() {
        MockitoAnnotations.initMocks(this);
    }

    @Provides
    @Singleton
    public BaseSchedulerProvider provideBaseScheduler() {
        when(schedulerProvider.computation()).thenReturn(testScheduler);
        when(schedulerProvider.io()).thenReturn(testScheduler);
        when(schedulerProvider.ui()).thenReturn(AndroidSchedulers.mainThread());
        return schedulerProvider;
    }

}

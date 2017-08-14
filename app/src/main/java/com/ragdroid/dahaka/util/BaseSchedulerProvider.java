package com.ragdroid.dahaka.util;

import android.support.annotation.NonNull;

import io.reactivex.Scheduler;

/**
 * Created by garimajain on 13/08/17.
 */

public interface BaseSchedulerProvider {
    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();
}

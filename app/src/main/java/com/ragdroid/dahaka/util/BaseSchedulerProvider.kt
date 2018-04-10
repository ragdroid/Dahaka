package com.ragdroid.dahaka.util

import io.reactivex.Scheduler

/**
 * Created by garimajain on 13/08/17.
 */

interface BaseSchedulerProvider {
    fun computation(): Scheduler

    fun io(): Scheduler

    fun ui(): Scheduler
}

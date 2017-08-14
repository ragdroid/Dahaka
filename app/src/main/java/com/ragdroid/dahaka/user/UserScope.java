package com.ragdroid.dahaka.user;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by garimajain on 05/03/17.
 */
@Scope
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
public @interface UserScope {
}

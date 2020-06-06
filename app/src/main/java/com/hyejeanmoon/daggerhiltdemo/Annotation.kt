package com.hyejeanmoon.daggerhiltdemo

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class AppHash

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class ActivityHash

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
internal annotation class FragmentHash


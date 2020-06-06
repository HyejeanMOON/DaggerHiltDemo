package com.hyejeanmoon.daggerhiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {
    
    @ActivityHash
    @Provides
    fun provideHash(): String {
        return hashCode().toString()
    }

}
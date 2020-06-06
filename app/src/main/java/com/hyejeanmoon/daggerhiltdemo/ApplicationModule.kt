package com.hyejeanmoon.daggerhiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class ApplicationModule {
    @AppHash
    @Provides
    fun provideHash(): String {
        return hashCode().toString()
    }
}
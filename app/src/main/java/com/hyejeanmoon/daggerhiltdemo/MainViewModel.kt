package com.hyejeanmoon.daggerhiltdemo

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(
    private val repository: SampleRepository,
    @Assisted private val savedState: SavedStateHandle
) : ViewModel() {

    fun getRepositoryString(): String = repository.toString()

}
package com.example.jetpack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * 计数ViewModel
 */
class CountViewModel : ViewModel() {
    // 计数LiveData
    val count: MutableLiveData<Int> = MutableLiveData(0)

}
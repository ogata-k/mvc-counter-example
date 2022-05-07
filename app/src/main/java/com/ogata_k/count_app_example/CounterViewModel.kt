package com.ogata_k.count_app_example

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    val count = MutableLiveData<Int>(0)
}
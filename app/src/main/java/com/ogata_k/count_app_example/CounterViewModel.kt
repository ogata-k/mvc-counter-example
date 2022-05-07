package com.ogata_k.count_app_example

import androidx.lifecycle.MutableLiveData

class CounterViewModel : BaseViewModel() {
    val count = MutableLiveData<Int>(0)
}
package com.ogata_k.count_app_example

class CounterController(private val vm: CounterViewModel) {
    fun countUp(){
        vm.count.postValue(vm.count.value!!+1)
    }
}
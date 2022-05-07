package com.ogata_k.count_app_example

class CounterController(vm: CounterViewModel): BaseController<CounterViewModel>(vm) {
    fun countUp() {
        vm.count.postValue(vm.count.value!! + 1)
    }
}
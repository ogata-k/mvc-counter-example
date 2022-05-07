package com.ogata_k.count_app_example

interface ControllerView<ViewModel: BaseViewModel, Controller: BaseController<ViewModel>> {
    fun controller(): Controller
}
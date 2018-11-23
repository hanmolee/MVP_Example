package com.hanmo.mvp_example.base

interface BasePresenter<T> {

    fun takeView(view: T)
    fun dropView()

}
package com.hanmo.mvp_example.presenter

import com.hanmo.mvp_example.base.BasePresenter
import com.hanmo.mvp_example.base.BaseView
import com.hanmo.mvp_example.model.Dog

interface SearchContract {

    interface View : BaseView {
        fun showLoading()
        fun hideLoading()
        fun showDogList(dogList : List<Dog>)
    }

    interface Presenter : BasePresenter<View> {
        fun getDogList()
    }

}
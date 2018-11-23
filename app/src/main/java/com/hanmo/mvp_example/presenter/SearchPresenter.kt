package com.hanmo.mvp_example.presenter

import com.hanmo.mvp_example.model.DogListData

class SearchPresenter : SearchContract.Presenter {

    private var searchView : SearchContract.View? = null

    override fun takeView(view: SearchContract.View) {
        searchView = view
    }

    override fun getDogList() {

    }

    override fun dropView() {
        searchView = null
    }

}
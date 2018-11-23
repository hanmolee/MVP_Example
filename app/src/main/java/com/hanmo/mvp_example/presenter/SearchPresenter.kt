package com.hanmo.mvp_example.presenter

import android.os.Handler
import com.hanmo.mvp_example.model.DogListData

class SearchPresenter : SearchContract.Presenter {

    private var searchView : SearchContract.View? = null

    override fun takeView(view: SearchContract.View) {
        searchView = view
    }

    override fun getDogList() {
        searchView?.showLoading()

        Handler().postDelayed({
            val dogList = DogListData.getDoglistData()
            searchView?.showDogList(dogList)
            searchView?.hideLoading()
        }, 1000)
    }

    override fun dropView() {
        searchView = null
    }

}
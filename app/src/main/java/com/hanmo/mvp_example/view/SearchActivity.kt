package com.hanmo.mvp_example.view

import android.os.Bundle
import com.hanmo.mvp_example.R
import com.hanmo.mvp_example.base.BaseActivity
import com.hanmo.mvp_example.model.Dog
import com.hanmo.mvp_example.presenter.SearchContract
import com.hanmo.mvp_example.presenter.SearchPresenter
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : BaseActivity(), SearchContract.View {

    lateinit var searchPresenter: SearchPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        searchPresenter.takeView(this)

    }

    override fun showDogList(dogList : List<Dog>) {

    }

    override fun onDestroy() {
        super.onDestroy()
        searchPresenter.dropView()
    }


    override fun initPresenter() {
        searchPresenter = SearchPresenter()
    }

    override fun showError(error: String) {

    }

}

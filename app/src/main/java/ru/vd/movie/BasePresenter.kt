package ru.vd.movie


abstract class BasePresenter<V : BaseView> {

    var view: V? = null

    fun attachView(view: V) {
        this.view = view
    }

    fun detachView() {
        view = null
    }

    val isViewAttached = view != null
}
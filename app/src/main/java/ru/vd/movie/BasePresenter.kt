package ru.vd.movie

interface BasePresenter<T> {
    var view: T?
    fun attachView(view: T) {
        this.view = view
    }

    fun detachView() {
        this.view = null
    }
}
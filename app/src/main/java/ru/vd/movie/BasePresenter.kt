package ru.vd.movie

interface BasePresenter<T> {
    fun attachView(view: T)
    fun detachView()
}
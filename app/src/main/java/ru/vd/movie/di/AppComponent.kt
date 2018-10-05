package ru.vd.movie.di

import dagger.Component
import ru.vd.movie.movies.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun inject(activity: MainActivity)
}
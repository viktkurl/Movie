package ru.vd.api.components

import dagger.Component
import retrofit2.Retrofit
import ru.vd.api.modules.RetrofitModule

/**
 * Created by viktor on 18/10/2018
 *
 * @author viktor
 */
@Component(modules = [RetrofitModule::class])
interface RetrofitComponent {
	fun getRetrofit(): Retrofit
}
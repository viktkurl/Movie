package ru.vd.api.components

import dagger.Component
import okhttp3.OkHttpClient
import ru.vd.api.modules.OkHttpClientModule

/**
 * Created by viktor on 18/10/2018
 *
 * @author viktor
 */
@Component(modules = [OkHttpClientModule::class])
interface OkHttpClientComponent {
	fun getOkHttpClient(): OkHttpClient
}
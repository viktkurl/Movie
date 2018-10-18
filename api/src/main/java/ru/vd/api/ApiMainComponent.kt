package ru.vd.api

import com.squareup.moshi.Moshi
import dagger.Component
import okhttp3.OkHttpClient
import ru.vd.api.modules.MoshiModule
import ru.vd.api.modules.OkHttpClientModule
import ru.vd.api.modules.RestModule
import javax.inject.Singleton

/**
 * Created by viktor on 11/10/2018
 *
 * @author viktor
 */
@Singleton
@Component(modules = [MoshiModule::class, RestModule::class, OkHttpClientModule::class])
interface ApiMainComponent {
	fun getMoshi(): Moshi

	fun getHttpClient(): OkHttpClient
}
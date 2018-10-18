package ru.vd.api

import com.squareup.moshi.Moshi
import dagger.Component
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import ru.vd.api.components.MoshiComponent
import ru.vd.api.components.OkHttpClientComponent
import ru.vd.api.components.RetrofitComponent
import ru.vd.api.modules.MoshiModule
import ru.vd.api.modules.OkHttpClientModule
import ru.vd.api.modules.RetrofitModule
import javax.inject.Singleton

/**
 * Created by viktor on 11/10/2018
 *
 * @author viktor
 */
@Singleton
@Component(dependencies = [
	MoshiComponent::class,
	RetrofitComponent::class,
	OkHttpClientComponent::class
])
interface ApiMainComponent {
	fun getMoshi(): Moshi

	fun getRetrofit(): Retrofit

	fun getHttpClient(): OkHttpClient
}
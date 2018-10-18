package ru.vd.api.modules

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

/**
 * Created by viktor on 16/10/2018
 *
 * @author viktor
 */
@Module
class RestModule {
	@Provides
	@Singleton
	fun getRetrofit(okHttpClient: OkHttpClient,
					converterFactory: MoshiConverterFactory): Retrofit =
			Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/").build()
}
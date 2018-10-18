package ru.vd.api.modules

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

/**
 * Created by viktor on 18/10/2018
 *
 * @author viktor
 */
@Module
class OkHttpClientModule {
	@Provides
	fun okHttpClient(): OkHttpClient = OkHttpClient().newBuilder().build()
}
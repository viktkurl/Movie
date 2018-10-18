package ru.vd.api.modules

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by viktor on 16/10/2018
 *
 * @author viktor
 */
@Module
class MoshiModule {
	@Singleton
	@Provides
	fun getMoshi(): Moshi = Moshi.Builder().build()
}
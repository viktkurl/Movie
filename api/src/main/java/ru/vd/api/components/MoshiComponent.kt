package ru.vd.api.components

import com.squareup.moshi.Moshi
import dagger.Component
import ru.vd.api.modules.MoshiModule
import javax.inject.Singleton

/**
 * Created by viktor on 18/10/2018
 *
 * @author viktor
 */
@Singleton
@Component(modules = [MoshiModule::class])
interface MoshiComponent {
	fun getMoshi(): Moshi
}
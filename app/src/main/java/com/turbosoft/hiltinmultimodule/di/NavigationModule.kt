package com.turbosoft.hiltinmultimodule.di

import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import com.turbosoft.hiltinmultimodule.HiltTestApplication
import com.turbosoft.hiltinmultimodule.Screens
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NavigationModule {

    @Singleton
    @Provides
    fun provideApplication(): HiltTestApplication = HiltTestApplication.INSTANCE

    @Singleton
    @Provides
    fun provideNavigatorHolder(application: HiltTestApplication): NavigatorHolder =
        application.navigatorHolder

    @Singleton
    @Provides
    fun provideRouter(application: HiltTestApplication): Router = application.router

}
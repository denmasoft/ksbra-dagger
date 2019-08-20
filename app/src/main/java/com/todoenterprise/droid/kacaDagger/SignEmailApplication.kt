package com.todoenterprise.droid.kacaDagger

import com.todoenterprise.droid.kacaDagger.di.components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class SignEmailApplication: DaggerApplication() {

    private val appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return appComponent
    }
}
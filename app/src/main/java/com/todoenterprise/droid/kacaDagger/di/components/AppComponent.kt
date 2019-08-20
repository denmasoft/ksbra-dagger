package com.todoenterprise.droid.kacaDagger.di.components

import android.app.Application
import com.todoenterprise.droid.kacaDagger.di.modules.ActivityModule
import com.todoenterprise.droid.kacaDagger.di.modules.DatabaseModule
import com.todoenterprise.droid.kacaDagger.di.modules.FragmentModule
import com.todoenterprise.droid.kacaDagger.di.modules.NetworkModule
import com.todoenterprise.droid.kacaDagger.di.modules.RepositoryModule
import com.todoenterprise.droid.kacaDagger.di.modules.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ActivityModule::class,
    FragmentModule::class,
    RepositoryModule::class,
    ViewModelModule::class,
    NetworkModule::class,
    DatabaseModule::class])
interface AppComponent : AndroidInjector<DaggerApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }

    override fun inject(instance: DaggerApplication)
}
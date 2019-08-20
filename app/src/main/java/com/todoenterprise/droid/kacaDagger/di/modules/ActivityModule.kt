package com.todoenterprise.droid.kacaDagger.di.modules


import com.todoenterprise.droid.kacaDagger.MainActivity
import com.todoenterprise.droid.kacaDagger.SignActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Suppress("unused")
@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector
    internal abstract fun contributeSignInActivity(): SignActivity
}
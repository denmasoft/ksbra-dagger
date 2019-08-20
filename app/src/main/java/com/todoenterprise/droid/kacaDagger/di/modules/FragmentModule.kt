package com.todoenterprise.droid.kacaDagger.di.modules

import com.todoenterprise.droid.kacaDagger.sign.view.fragment.SignEmailFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Suppress("unused")
@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeSignEmailFragment(): SignEmailFragment
}

package com.todoenterprise.droid.kacaDagger.di.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.todoenterprise.droid.kacaDagger.sign.factory.AppViewModelFactory
import com.todoenterprise.droid.kacaDagger.sign.viewmodel.SignEmailViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
internal abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(SignEmailViewModel::class)
    internal abstract fun bindSignEmailViewModel(signEmailViewModel: SignEmailViewModel): ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory
}
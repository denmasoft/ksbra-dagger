package com.todoenterprise.droid.kacaDagger.sign.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log

import io.reactivex.observers.DisposableObserver
import javax.inject.Inject
import com.todoenterprise.droid.kacaDagger.domain.entities.UserEntity
import com.todoenterprise.droid.kacaDagger.domain.interfaces.UserRepository

class SignEmailViewModel @Inject constructor(private val userRepository: UserRepository): ViewModel() {

    fun test(){
        userRepository.test()
    }
}
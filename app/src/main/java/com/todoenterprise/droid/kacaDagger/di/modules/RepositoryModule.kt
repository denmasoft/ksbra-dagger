package com.todoenterprise.droid.kacaDagger.di.modules

import com.todoenterprise.droid.kacaDagger.data.db.UserDao
import com.todoenterprise.droid.kacaDagger.data.repositories.UserRepositoryImpl
import com.todoenterprise.droid.kacaDagger.domain.interfaces.UserRepository
import dagger.Module
import dagger.Provides
import io.reactivex.annotations.NonNull
import javax.inject.Singleton


@Module
class RepositoryModule {
    @Provides
    @Singleton
    fun provideUserRepository(@NonNull userDao: UserDao): UserRepository {
        return UserRepositoryImpl(userDao)
    }
}

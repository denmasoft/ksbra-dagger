package com.todoenterprise.droid.kacaDagger.di.modules

import android.app.Application
import android.arch.persistence.room.Room
import com.todoenterprise.droid.kacaDagger.data.db.UserDao
import com.todoenterprise.droid.kacaDagger.data.db.UserDatabase
import dagger.Module
import dagger.Provides
import io.reactivex.annotations.NonNull
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@NonNull application: Application): UserDatabase {
        return Room.databaseBuilder(application, UserDatabase::class.java, "Users.db").allowMainThreadQueries().build()
    }

    @Provides
    @Singleton
    fun provideUserDao(@NonNull database: UserDatabase): UserDao {
        return database.userDao()
    }
}
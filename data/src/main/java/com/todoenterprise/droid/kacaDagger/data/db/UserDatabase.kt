package com.todoenterprise.droid.kacaDagger.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.todoenterprise.droid.kacaDagger.domain.entities.UserEntity

@Database(entities = [UserEntity::class], version = 1, exportSchema = false)
abstract class UserDatabase: RoomDatabase() {

    abstract fun userDao(): UserDao
}
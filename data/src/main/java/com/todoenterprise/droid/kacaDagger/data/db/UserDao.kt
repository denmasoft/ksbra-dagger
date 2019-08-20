package com.todoenterprise.droid.kacaDagger.data.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.todoenterprise.droid.kacaDagger.domain.entities.UserEntity
import io.reactivex.Single

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getUsers(): Single<List<UserEntity>>

    @Query("SELECT * FROM user where email=:email")
    fun search(email: String): Single<List<UserEntity>>

    @Query("SELECT * FROM user where email=:email")
    fun getUser(email: String): Single<List<UserEntity>>

    @Query("SELECT * FROM user where id=:id")
    fun getUser(id: Int): Single<List<UserEntity>>
    @Query("SELECT * FROM user where email=:email and password=:password")
    fun getUser(email: String, password: String): Single<List<UserEntity>>

    @Insert(
            onConflict = OnConflictStrategy.REPLACE
    )
    fun insertUser(UserEntity: UserEntity)
}
package com.todoenterprise.droid.kacaDagger.domain.interfaces

import com.todoenterprise.droid.kacaDagger.domain.entities.UserEntity
import io.reactivex.Observable

interface UserRepository {
    fun getUsers(): Observable<List<UserEntity>>
    fun search(query: String): Observable<List<UserEntity>>
    fun getUserId(userId: Int): Observable<List<UserEntity>>
    fun getUser(email: String): Observable<List<UserEntity>>
    fun signIn(email: String,password: String): Observable<List<UserEntity>>
    fun test()
}

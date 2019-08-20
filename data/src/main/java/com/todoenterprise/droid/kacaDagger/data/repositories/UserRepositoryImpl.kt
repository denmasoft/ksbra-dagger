package com.todoenterprise.droid.kacaDagger.data.repositories

import android.util.Log
import javax.inject.Inject
import com.todoenterprise.droid.kacaDagger.domain.entities.UserEntity
import com.todoenterprise.droid.kacaDagger.data.db.UserDao
import com.todoenterprise.droid.kacaDagger.domain.interfaces.UserRepository
import io.reactivex.Observable

class UserRepositoryImpl @Inject constructor(val userDao: UserDao): UserRepository{

    override fun getUsers(): Observable<List<UserEntity>> {
        return userDao.getUsers()
                .toObservable()
                .doOnNext {
                    Log.e("Data ", it.size.toString())
                }
    }

    override fun search(query: String): Observable<List<UserEntity>> {
        return userDao.search(query)
                .toObservable()
                .doOnNext {
                    Log.e("Data ", it.size.toString())
                }
    }

    override fun getUserId(userId: Int): Observable<List<UserEntity>> {
        return userDao.getUser(userId)
                .toObservable()
                .doOnNext {
                    Log.e("Data", "")
                }
    }

    override fun getUser(email: String): Observable<List<UserEntity>> {
        return userDao.getUser(email)
                .toObservable()
                .doOnNext {
                    Log.e("Data", "")
                }
    }

    override fun signIn(email: String,password: String): Observable<List<UserEntity>> {
        return userDao.getUser(email,password)
                .toObservable()
                .doOnNext {
                    Log.e("Data", "")
                }
    }

    override fun test() {
        Log.d("DAGGER","DAGGERDAGGERDAGGERDAGGERDAGGERDAGGERDAGGERv DAGGERDAGGERDAGGER DAGGERDAGGERDAGGER")
    }
}
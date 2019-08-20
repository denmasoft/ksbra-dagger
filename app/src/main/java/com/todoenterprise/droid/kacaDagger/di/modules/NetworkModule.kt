package com.todoenterprise.droid.kacaDagger.di.modules

import dagger.Module
import dagger.Provides
import io.reactivex.annotations.NonNull
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
                .addInterceptor(HttpLoggingInterceptor())
                .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(@NonNull okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("https://api.com/")
                .addConverterFactory(GsonConverterFactory.create())
                //.addCallAdapterFactory(LiveDataCallAdapterFactory())
                .build()
    }
    /*@Provides
    @Singleton
    fun provideUserService(@NonNull retrofit: Retrofit): UserService {
        return retrofit.create(UserService::class.java)
    }*/
}
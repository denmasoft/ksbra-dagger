package com.todoenterprise.droid.kacaDagger.domain.entities
import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import com.squareup.moshi.Json
import android.arch.persistence.room.PrimaryKey
import java.io.Serializable

@Entity(
        tableName = "user"
)
data class UserEntity(
        @Json(name = "id")
        @PrimaryKey
        @ColumnInfo(name = "id")
        var id: Int = 0,
        @Json(name = "email")
        @ColumnInfo(name = "email")
        var email: String,
        @Json(name = "password")
        @ColumnInfo(name = "password")
        var password: String
): Serializable
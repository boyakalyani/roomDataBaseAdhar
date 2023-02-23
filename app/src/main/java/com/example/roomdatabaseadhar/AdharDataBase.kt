package com.example.roomdatabaseadhar


import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import java.time.Instant

@Database(entities = [AdharEntity::class], version = 11,exportSchema = false)

abstract class AdharDataBase:RoomDatabase (){
    abstract fun adharDao():AdharDao

    companion object {
        @Volatile
        private var INSTANCE :AdharDataBase?=null
        private val LOCK=Any()

        operator fun invoke(context: Context)= INSTANCE?: synchronized(LOCK) {
            INSTANCE ?: buildDatabase(context).also {
                INSTANCE = it
            }
        }
        private fun buildDatabase(context: Context)=Room.databaseBuilder(
                context.applicationContext,
            AdharDataBase::class.java,"app_database").build()
            }
        }

package com.example.roomdatabaseadhar


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "AdharDetails")
data class AdharEntity(
    @PrimaryKey(autoGenerate = true) val id:Int,
    @ColumnInfo(name = "adharNumber_id")
    val adharNumber:String="",
    @ColumnInfo(name = "adharHolderName_id")
    val adharHolderName:String="",
    @ColumnInfo(name ="adharDOB_id" )
    val adharDOB:String="",

    @ColumnInfo(name = "adharCity_id")
    val adharCity:String=""
)
//    @ColumnInfo(name = "Gender_id")
//    val Gender:String



//idhi work cheyakapothey ? add chei String pakkana kna id thiesesi normal table colum headlines avi kna


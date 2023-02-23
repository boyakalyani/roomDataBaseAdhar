package com.example.roomdatabaseadhar



import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface AdharDao {
    @Insert
     fun insertAdhar(adharEntity: AdharEntity)

    @Delete
    suspend fun delete(adharEntity: AdharEntity)
    @Update
    suspend fun update(adharEntity: AdharEntity)

    @Query("SELECT*FROM AdharDetails ORDER BY id DESC")
    fun getAllAdhar():List<AdharEntity>


//
//    @Query("SELECT * FROM AdharDetails WHERE uid IN (:adharIds)")
////    suspend fun findByAdharNumber(adhar: Int):AdharEntity
//fun loadAllByIds(adharIds: Int): List<AdharEntity> //int arrray
//
//    @Query("SELECT * FROM AdharDetails WHERE adharNumber_id LIKE :Number AND " +
//            "adharHolderName_id LIKE :Name LIMIT 1")
//    fun findByName(Number: String, Name: String): AdharEntity
//
//    @Insert
//    fun insertAll(vararg users: AdharEntity)
//    @Delete
//    fun delete(user: AdharEntity)

//    @Insert(onConflict = OnConflictStrategy.IGNORE)
//    suspend fun addUser(adharEntity: AdharEntity)
//
//    @Delete
//    suspend fun deleteAdharDetails(adharEntity: AdharEntity)
//    @Update
//    fun updateAharDetails(adharEntity: AdharEntity)
//    @Delete
//    fun deleteAll()
    }

//    @Query("SELECT*FROM AdharDetails")
//    suspend fun deleteAll() :Void//:List<AdharEntity>
//@Query("DELETE FROM adhardetails")
//fun deleteAll(): Void


//    @Query("UPDATE adhardetails SET adharNumber_id=:adharNum,adharHolderName_id=:adharName WHERE adharNumber_id LIKE:adhar")
//    suspend fun update(adharNum:Int,adharName:String,adhar: Int)
//
////new video
//    @Query(value = "SELECT * FROM adhardetails")
//    fun readAllData():LiveData<List<AdharEntity>>
//}
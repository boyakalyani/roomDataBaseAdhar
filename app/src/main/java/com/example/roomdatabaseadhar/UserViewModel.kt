package com.example.roomdatabaseadhar

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import kotlinx.coroutines.launch

class UserViewModel(application: Application):AndroidViewModel(application) {
//    private val readAllData:LiveData<List<AdharEntity>>
//    private val repository:UserRepository

//    init {
//        val  adharDao=AdharDataBase.getDatabase(application).adharDao()
//        repository= UserRepository(adharDao)
//        readAllData=repository.readAllData
//    }
//    fun addUser(adharEntity: AdharEntity){
//        viewModelScope.launch {
//            repository.addUser(adharEntity)
//        }
//    }
}
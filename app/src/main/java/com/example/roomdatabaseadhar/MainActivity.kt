package com.example.roomdatabaseadhar



import android.accounts.AccountManager.get
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.core.content.res.TypedArrayUtils.getText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import kotlinx.coroutines.*
import java.lang.reflect.Array.get

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        fallbackToDestructiveMigration()

        val btnInsertData = findViewById<Button>(R.id.insert_id)

        btnInsertData.setOnClickListener(){
            startActivity(Intent(this,addData::class.java))
        }
    }

//    override fun onResume() {
//        super.onResume()
//        GlobalScope.launch {
//            val userList = AdharDataBase(this@MainActivity).adharDao().getAllAdhar()
//            val recycler = findViewById<RecyclerView>(R.id.RV_id)
//
//            recycler.apply {
//                layoutManager = LinearLayoutManager(this@MainActivity)
//                adapter = adharAdapter().apply {
////                    setData(userList)
//                    userList
//                }
//            }
//        }
//    }
override fun onResume() {
    super.onResume()
    GlobalScope.launch {
        val userList=AdharDataBase(this@MainActivity).adharDao().getAllAdhar()
        withContext(Dispatchers.Main) {
            val recycler = findViewById<RecyclerView>(R.id.RV_id)
            recycler.apply {
                layoutManager=LinearLayoutManager(this@MainActivity)
                adapter=adharAdapter().apply {
                    setData(userList)
                }
            }
        }
    }

                    }
                }

//            }

//}


//        btnInsertData.setOnClickListener(){
//            CoroutineScope(Dispatchers.IO).launch {
//        val adharEntity=AdharEntity(0,423896781,"kalyani",9-2-3,"apv ")
//                jk.adharDao().insertAdhar(adharEntit)
////                withContext(Dispatchers.IO){
////                    Toast.makeText(this@MainActivity, "succussee full inserted", Toast.LENGTH_SHORT).show()

//}
//        val sharedPreference=getSharedPreferences()
//        val dataBase=
//            Room.databaseBuilder(this@MainActivity,AdharDataBase::class.java,"adhar_database").build()
//
//        val adharEntity=AdharEntity(0,
//            "kalyani",
//            12-5-200)
//        btn1.setOnClickListener {
//            CoroutineScope(Dispatchers.IO).launch {
//                dataBase.adharDao().insertAdharDetails(adharEntity)
//                withContext(Dispatchers.Main) {
//                    Toast.makeText(
//                        this@MainActivity,
//                        "Data inserted Succeessfully",
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }              //dataBase.adharDao().insertAdhar()
//
//            }
//        }
//    }
//}
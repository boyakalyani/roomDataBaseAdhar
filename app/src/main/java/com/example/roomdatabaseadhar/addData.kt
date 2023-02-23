package com.example.roomdatabaseadhar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Lifecycle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class addData : AppCompatActivity() {
    lateinit var edt1: EditText
    lateinit var edt2: EditText
    lateinit var edt3: EditText
    lateinit var edt4: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_data)

        edt1 = findViewById(R.id.adharNumber_id)
        edt2 = findViewById(R.id.holderName_id)
        edt3 = findViewById(R.id.DOB_ID)
        edt4 = findViewById(R.id.adres_id)

        val addBtnUser = findViewById<Button>(R.id.addUser_id)

        addBtnUser.setOnClickListener(){
            insertAdhar()
        }

    }

    private  fun insertAdhar() {
        val num=edt1.text.toString()
        val name=edt2.text.toString()
        val DoB=edt3.text.toString()
        val adrees=edt4.text.toString()

        GlobalScope.launch {
            val adharEntity = AdharEntity(
                0,
                adharNumber = num,
                adharHolderName = name,
                adharDOB = DoB,
                adharCity = adrees
            )
            AdharDataBase(this@addData).adharDao().insertAdhar(adharEntity)
            finish()
        }
    }
}
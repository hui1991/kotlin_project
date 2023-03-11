package com.example.kotlin.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlin.R
import kotlinx.coroutines.*

private const val TAG = "CoroutinesActivity"

class CoroutinesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)
        coroutinesTest()
    }

    private fun coroutinesTest(){
        val mainScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)
        mainScope.launch {
            Log.i(TAG,"mainScope: Thread = "+Thread.currentThread().name+" hello coroutine")
        }

        val ioScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
        ioScope.launch (){
            Log.i(TAG,"ioScope: Thread = "+Thread.currentThread().name+" hello coroutine")
        }

        runBlocking {
            Log.i(TAG,"runBlocking: Thread = "+Thread.currentThread().name+" hello coroutine")
            delay(1000L)
            Log.i(TAG,"runBlocking: delay(1000L) Thread = "+Thread.currentThread().name+" hello coroutine")
        }
    }
}
package com.shalomhalbert.popup.practicekotlincoroutines

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.experimental.*

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        runBlocking {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            GlobalScope.launch {
                repeat(1_000) {
                    Log.e(TAG, "I'm sleeping $it")
                    delay(500L)
                }
            }
            delay(1300L)
        }
    }

    //    override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_main)
//            var counter = 0
//        runBlocking {
//            repeat(100000) {
//                    delay(1000L)
//                    Log.e(TAG, "Counter is at $counter")
//                    counter++
//            }
//        }
//        Log.e(TAG, "Finished!")
//    }

    //    override fun onCreate(savedInstanceState: Bundle?) {
//        runBlocking {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_main)
//
//            launch { logWorld() }
//            Log.e(TAG, "Hello")
//
//        }
//    }
//
//    private suspend fun logWorld() {
//        delay(1000L)
//        Log.e(TAG, "World!")
//    }


    //    override fun onCreate(savedInstanceState: Bundle?) {
//        runBlocking {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_main)
//
//            launch {
//                delay(200L)
//                Log.e(TAG, "Task from runBlocking{}")
//            }
//
//            coroutineScope {
//                launch {
//                    delay(500L)
//                    Log.e(TAG, "Task from nested launch")
//                }
//
//                delay(100L)
//                Log.e(TAG, "Task from coroutine{} scope")
//            }
//
//            Log.e(TAG, "coroutineScope{} is over")
//        }
//    }



}

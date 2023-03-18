package com.example.jetpack

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

var TAG = "ExampleLifecycle"

class ExampleLifecycle : DefaultLifecycleObserver {


    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        Log.i(
            TAG,
            "LifecycleOwner = ${owner.javaClass} currentState = ${owner.lifecycle.currentState}"
        )
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        Log.i(
            TAG,
            "LifecycleOwner = ${owner.javaClass} currentState = ${owner.lifecycle.currentState}"
        )
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Log.i(
            TAG,
            "LifecycleOwner = ${owner.javaClass} currentState = ${owner.lifecycle.currentState}"
        )
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Log.i(
            TAG,
            "LifecycleOwner = ${owner.javaClass} currentState = ${owner.lifecycle.currentState}"
        )
    }

}
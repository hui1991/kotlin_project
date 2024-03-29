package com.example.kotlin

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.json.JSONArray
import org.json.JSONObject

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.kotlin", appContext.packageName)


        val jsonArray = JSONArray()

        val jsonObject = JSONObject()
        jsonObject.put("bsnCode", "000")
        jsonObject.put("jumpType", "1")

        jsonArray.put(jsonObject)
        jsonArray.put(jsonObject)

        println(jsonArray.toString())
    }
}
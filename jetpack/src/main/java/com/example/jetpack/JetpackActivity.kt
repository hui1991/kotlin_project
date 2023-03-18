package com.example.jetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_jetpack.*

class JetpackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jetpack)

        // 注册LifecycleObserver
        lifecycle.addObserver(ExampleLifecycle())

        // 实例化ViewModel
        val countViewModel = ViewModelProvider(this).get(CountViewModel::class.java)

        // 观察者
        val countObserver = Observer<Int> {
            counterText.text = it.toString()
        }

        // 注册观察者
        countViewModel.count.observe(this, countObserver)

        // 更新LiveData
        // setValue和postValue的区别
        // setValue在主线程调用
        // postValue在子线程调用post一个task到主线程更新value，在没有更新前的多次调用只会更新最后一次的值
        plus.setOnClickListener {
            countViewModel.count.value = countViewModel.count.value?.plus(1)
        }
        minus.setOnClickListener {
            countViewModel.count.value = countViewModel.count.value?.minus(1)
        }
    }
}
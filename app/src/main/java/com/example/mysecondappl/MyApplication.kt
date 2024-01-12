package com.example.mysecondappl

import android.app.Application
import com.example.mylibrary.Paths
class MyApplication:Application() {
val pathsList: Paths = Paths("pathsList")
    override fun onCreate() {
        super.onCreate()

    }

}
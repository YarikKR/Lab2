package com.arm.malideveloper.openglessdk.rvd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arm.malideveloper.openglessdk.rvd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)


    }



}
package com.carloszaragoza.swipable_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listImages = listOf<Int>(R.drawable.a, R.drawable.a, R.drawable.a)
        val adapter = ViewPagerAdapter(listImages)
        val vp = findViewById<ViewPager2>(R.id.viewPager)
        vp.adapter = adapter
    }
}
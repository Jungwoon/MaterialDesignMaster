package com.byjw.materialdesignmaster

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val mTextMessage: TextView = findViewById(R.id.message) as TextView
    val navigation = findViewById(R.id.navigation) as BottomNavigationView

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_movies -> {
                mTextMessage.text = "Movies & TV"
                navigation.setBackgroundColor(this.resources.getColor(R.color.abc_color_highlight_material))
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_music -> {
                mTextMessage.text = "Music"
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_books -> {
                mTextMessage.text = "Books"
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_news -> {
                mTextMessage.text = "Newsstand"
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

}

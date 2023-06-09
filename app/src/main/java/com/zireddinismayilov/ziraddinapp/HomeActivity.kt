package com.zireddinismayilov.ziraddinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav_bar)
        val homeTv = findViewById<TextView>(R.id.homeTv)

        val homeFragment = Home()
        val palmistryFragment = Palmistry()
        val horoscopeFragment = Horoscope()
        val inboxFragment = Inbox()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, homeFragment)
            commit()
        }

        bottomNav.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.item1 -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment_container, homeFragment)
                        commit()
                    }
                    homeTv.setText("Home")
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.item2 -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment_container, palmistryFragment)
                        commit()
                    }
                    homeTv.setText("Palmistry")
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.item3 -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment_container, horoscopeFragment)
                        commit()
                    }
                    homeTv.setText("Horoscope")
                    return@setOnNavigationItemSelectedListener true
                }

                R.id.item4 -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragment_container, inboxFragment)
                        commit()
                    }
                    homeTv.setText("Inbox")
                    return@setOnNavigationItemSelectedListener true
                }

                else -> {
                    return@setOnNavigationItemSelectedListener true
                }
            }
        }
    }
}
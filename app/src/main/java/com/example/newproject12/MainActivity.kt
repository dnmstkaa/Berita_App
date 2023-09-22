package com.example.newproject12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.example.newproject12.activity.HomeFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawer: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navView = findViewById(R.id.navigationview)
        drawer = findViewById(R.id.drawerlayout)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.title = "Berita Online"

        toggle = ActionBarDrawerToggle(this@MainActivity, drawer,
        0,0)

        drawer.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener(this)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, HomeFragment())
        fragmentTransaction.commit()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return toggle.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
      when (item.itemId) {
          R.id.menulogin -> Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show()
          R.id.menunewberita -> Toast.makeText(this, "New Berita", Toast.LENGTH_SHORT).show()
          R.id.menulogout -> Toast.makeText(this, "Log Out", Toast.LENGTH_SHORT).show()
      }
        return true
    }
}

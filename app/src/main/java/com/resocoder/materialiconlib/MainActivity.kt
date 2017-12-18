package com.resocoder.materialiconlib

import android.graphics.Color
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import net.steamcrafted.materialiconlib.MaterialDrawableBuilder
import net.steamcrafted.materialiconlib.MaterialMenuInflater

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            val materialIconDrawable = MaterialDrawableBuilder.with(this)
                    .setIcon(MaterialDrawableBuilder.IconValue.ANDROID)
                    .setColor(Color.GREEN)
                    .setSizeDp(48)
                    .build()
            imageView.setImageDrawable(materialIconDrawable)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        MaterialMenuInflater
                .with(this)
                .setDefaultColor(Color.WHITE)
                .inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}

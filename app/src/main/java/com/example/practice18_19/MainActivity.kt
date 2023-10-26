package com.example.practice18_19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
override fun onSendData(selectedItem: String?) {
    val fragment = supportFragmentManager
        .findFragmentById(R.id.InfoFragment) as InfoFragment?
    if (fragment != null && fragment.isVisible){
        fragment.setSelectedItem(selectedItem)
    }
    else{
        val intent = Intent(applicationContext,
            Main_Detalis::class.java)
        intent.putExtra(Main_Detalis.SELECTED_ITEM, selectedItem)
        startActivity(intent)
    }
    fragment?.setSelectedItem(selectedItem)
}
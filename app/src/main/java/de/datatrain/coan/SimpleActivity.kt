package de.datatrain.coan

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SimpleActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.simplelayout)
    }
}
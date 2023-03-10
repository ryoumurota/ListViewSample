package com.websarva.wings.android.listviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lvMenu = findViewById<ListView>(R.id.lvMenu)
        lvMenu.onItemClickListener = ListItemClickListener()
    }
    private inner class ListItemClickListener : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val item = parent.getItemAtPosition(position) as String
            val show = "Your selected data: $item"
            var tvMessage = findViewById<TextView>(R.id.tvMessage)
            tvMessage.setText(show.toString())

            val rootLayout: View = findViewById(android.R.id.content)
            val snackbar = Snackbar.make(rootLayout , show.toString(), Snackbar.LENGTH_LONG)
            snackbar.show()

            //Toast.makeText(applicationContext, show, Toast.LENGTH_LONG).show()
        }

    }

}
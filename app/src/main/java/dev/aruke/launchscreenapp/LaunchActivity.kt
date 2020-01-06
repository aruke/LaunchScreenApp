package dev.aruke.launchscreenapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        val mainIntent = Intent(this, MainActivity::class.java)
        startActivity(mainIntent)
    }
}

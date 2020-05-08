package com.akb.uts_10117149

/*
Tanggal Pengerjaan : Jum'at, 08 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.akb.uts_10117149.Walkthrough.WalkthroughActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //hiding title bar of this activity
        window.requestFeature(Window.FEATURE_NO_TITLE)
        //making this activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        //3second splash time
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@MainActivity, WalkthroughActivity::class.java))
            //finish this activity
            finish()
        },3000)

    }
}

package com.akb.uts_10117149

/*
Tanggal Pengerjaan : Jum'at, 08 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.akb.uts_10117149.Walkthrough.WalkthroughActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var topAnim : Animation
    private lateinit var bottomAnim : Animation
    private lateinit var logo : ImageView
    private lateinit var text1 : TextView
    private lateinit var text2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //making this activity full screen
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        logo = findViewById(R.id.imageView100)
        text1 = findViewById(R.id.textView100)
        text2 = findViewById(R.id.textView200)

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);

        logo.animation = topAnim
        text1.animation = bottomAnim
        text2.animation = bottomAnim

        //3second splash time
        Handler().postDelayed({
            //start main activity
            startActivity(Intent(this@MainActivity, WalkthroughActivity::class.java))
            //finish this activity
            finish()
        },3000)

    }
}

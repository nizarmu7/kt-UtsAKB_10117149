package com.akb.uts_10117149.Walkthrough

/*
Tanggal Pengerjaan : Jum'at, 08 Mei 2020
Nim : 10117149
Nama : M Nizar Miftahul Ulya
Kelas : IF-4
 */

import PreferenceHelper
import android.content.Intent
import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.akb.uts_10117149.HomeActivity
import com.github.paolorotolo.appintro.AppIntro

class WalkthroughActivity : AppIntro() {

    private var preferenceHelper: PreferenceHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState)

        preferenceHelper = PreferenceHelper(this)

        if (preferenceHelper!!.getIntro().equals("no")) {
            val intent = Intent(this@WalkthroughActivity, HomeActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            this.finish()
        }

        addSlide(WalkthroughFragment1())  //extend AppIntro and comment setContentView
        addSlide(WalkthroughFragment2())
        addSlide(WalkthroughFragment3())

    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)

        preferenceHelper!!.putIntro("no")

        val intent = Intent(this@WalkthroughActivity, HomeActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        this.finish()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)

        preferenceHelper!!.putIntro("no")

        val intent = Intent(this@WalkthroughActivity, HomeActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        this.finish()
    }

    override fun onSlideChanged(oldFragment: Fragment?, newFragment: Fragment?) {
        super.onSlideChanged(oldFragment, newFragment)
        // Do something when the slide changes.
    }
}
package com.subi.apfpoly

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.splashscreen.*

class SplashScreen : AppCompatActivity() {
    lateinit var anim1:Animation
    lateinit var anim2:Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN )
        setContentView(R.layout.splashscreen)
        anim1 = AnimationUtils.loadAnimation(this,R.anim.anim1)
        anim2 = AnimationUtils.loadAnimation(this,R.anim.anim2)
        //Animation
        ivLogo.startAnimation(anim1)
        textView.startAnimation(anim2)

        android.os.Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
        }, 2000)
    }
}
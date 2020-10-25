package com.hithamhl.archiveapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashIcon_iv.run {
            animate().scaleX(2F).scaleY(2f).setDuration(1000).withEndAction {
                splashIcon_iv.animate().scaleX(1f).scaleY(1f).duration = 500 }
        }

        Timer().schedule(object :TimerTask(){
            override fun run() {
                startActivity(Intent(this@SplashActivity,MainActivity::class.java))
                finish()
            }

        },2000L)




    }
}

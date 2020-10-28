package com.hithamhl.archiveapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hithamhl.archiveapp.MainActivity
import com.hithamhl.archiveapp.R
import kotlinx.android.synthetic.main.activity_splash.*
import java.util.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

      this.startScreen()
    }


    private fun startScreen(){

        runAnimation()

        Timer().schedule(object :TimerTask(){
            override fun run() {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                finish()
            }

        },2000L)
    }

    private fun runAnimation(){
        splashIcon_iv.run {
            animate().scaleX(2F).scaleY(2f).setDuration(1000).withEndAction {
                splashIcon_iv.animate().scaleX(1f).scaleY(1f).duration = 500 }
        }
    }
}

package com.asp.fliptimer

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.asp.fliptimerviewlibrary.CountDownClock
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timerProgramCountdown.startCountDown(99999999)
        timerProgramCountdown.setCountdownListener(object : CountDownClock.CountdownCallBack {
            override fun countdownAboutToFinish() {
                //TODO Add your code here
            }

            override fun countdownFinished() {
                Toast.makeText(this@MainActivity, "Finished", Toast.LENGTH_SHORT).show()
                timerProgramCountdown.resetCountdownTimer()
            }
        })

    }
}

package cn.icartoons.icartoon

import android.content.Intent
import android.os.Bundle
import com.besttone.BiAgent
import kotlinx.android.synthetic.main.activity_splash.*


class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        BiAgent.onStart(this, "400001", "141", 1)
    }

    override fun onResume() {
        super.onResume()
        helloWorld.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 800)
    }

}

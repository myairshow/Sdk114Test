package cn.icartoons.icartoon

import android.support.v7.app.AppCompatActivity
import com.besttone.BiAgent

open class BaseActivity : AppCompatActivity() {

    override fun onPause() {
        super.onPause()
        BiAgent.onPause(javaClass.simpleName)
    }

    override fun onResume() {
        super.onResume()
        BiAgent.onResume()
    }

}
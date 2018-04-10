package cn.icartoons.icartoon

import android.app.Application
import com.besttone.BiAgent

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        BiAgent.init(this)
    }
}
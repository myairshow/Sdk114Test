package cn.icartoons.icartoon

import android.os.Bundle
import com.besttone.BiAgent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            BiAgent.bindUserInfo(this,"70721837","13328322806")
        }
        eventButton.setOnClickListener {
            BiAgent.onEvent(this,"E0001","")
        }
    }
}

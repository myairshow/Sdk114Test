package cn.icartoons.icartoon

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_info.*


class InfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        //1. 获取手机型号：

        val model = android.os.Build.MODEL

        //2. 获取手机厂商：

        val carrier = android.os.Build.MANUFACTURER

        var build = model
        if (!model.startsWith(carrier)) {
            build = "$carrier $model"
        }

        val brand = android.os.Build.PRODUCT

        val text = "moduleName=$brand\ndeviceName=$build"

        info.text = text

        share.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_SUBJECT, "机型信息")
            intent.putExtra(Intent.EXTRA_TEXT, text)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(Intent.createChooser(intent, "分享到"))
        }
    }
}

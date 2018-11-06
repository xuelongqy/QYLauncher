package com.qingyi.qylauncher.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * @Title: BaseActivity类
 * @Package: com.qingyi.qylauncher.activity
 * @Description: 活动页面基础类
 * @author XueLong xuelongqy@foxmail.com
 * @date 2018/11/6 21:41
 * @update_author
 * @update_time
 * @exception
 * @version V1.0
*/
open class BaseActivity : AppCompatActivity() {

    // 页面创建时
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
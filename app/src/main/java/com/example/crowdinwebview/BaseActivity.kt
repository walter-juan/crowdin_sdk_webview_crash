package com.example.crowdinwebview

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.BaseContextWrappingDelegate

open class BaseActivity: AppCompatActivity() {
    override fun getDelegate(): BaseContextWrappingDelegate {
        return BaseContextWrappingDelegate(super.getDelegate())
    }
}
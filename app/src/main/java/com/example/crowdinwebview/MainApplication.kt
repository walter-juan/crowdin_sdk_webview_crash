package com.example.crowdinwebview

import android.app.Application
import com.crowdin.platform.Crowdin
import com.crowdin.platform.CrowdinConfig

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Crowdin.init(applicationContext,
            CrowdinConfig.Builder()
                .withDistributionHash("<distribution-hash>")
                .build())
    }
}
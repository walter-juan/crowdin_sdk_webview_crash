package com.example.crowdinwebview

import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.Toast
import com.example.crowdinwebview.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    private val defaultUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.urlEditText.setText(defaultUrl)

        binding.loadButton.setOnClickListener {
            val url = binding.urlEditText.text?.toString()
            if (url.isNullOrEmpty()) {
                Toast.makeText(this, "null or empty URL", Toast.LENGTH_SHORT).show()
            } else {
                binding.webView.loadUrl(url)
            }
        }

        initWebView()
    }

    private fun initWebView() {
        binding.webView.webViewClient = WebViewClient()
        binding.webView.webChromeClient = WebChromeClient()

        binding.webView.settings.javaScriptEnabled = true
        binding.webView.settings.builtInZoomControls = false
        binding.webView.settings.useWideViewPort = true
        binding.webView.settings.domStorageEnabled = true
        binding.webView.settings.javaScriptCanOpenWindowsAutomatically = true
        binding.webView.settings.setSupportMultipleWindows(true)
    }
}
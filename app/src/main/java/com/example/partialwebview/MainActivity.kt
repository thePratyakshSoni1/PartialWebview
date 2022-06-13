package com.example.partialwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView

class MainActivity : AppCompatActivity() {

    val mainPageUrl = "https://www.bbc.com/news/world-europe-60534641"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webViewMain)


        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()
        webView.webViewClient = WebViewSiteClient()
        webView.loadUrl(mainPageUrl)






    }
}
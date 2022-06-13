package com.example.partialwebview

import android.graphics.Bitmap
import android.util.Log
import android.webkit.ValueCallback
import android.webkit.WebView
import android.webkit.WebViewClient

class WebViewSiteClient:WebViewClient() {

    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        return super.shouldOverrideUrlLoading(view, url)
    }


    val hidingScript = scriptForIds+scriptForClasses

    val finalScript = hidingScript + "setTimeout( ()=>{" +
            hidingScript +
            "   },10000)"

    override fun onPageCommitVisible(view: WebView?, url: String?) {
        super.onPageCommitVisible(view, url)

//        view?.evaluateJavascript("document.getElementById('footer').style.display='none';"+
//                "document.getElementById('header').style.display='none';"+
//                "document.getElementById('menu').style.display='none';",ValueCallback<String>(){
//
//                    @Override
//                    fun onReceiveValue(value:String){
//                        Log.e("WEBVIEWCLIENT",value)
//                    }
//        })

        view?.evaluateJavascript(finalScript,ValueCallback<String>(){

                    @Override
                    fun onReceiveValue(value:String){
                        Log.e("WEBVIEWCLIENT",value)
                    }
        })

    }

}
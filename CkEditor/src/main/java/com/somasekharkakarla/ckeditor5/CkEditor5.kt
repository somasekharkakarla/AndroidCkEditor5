package com.somasekharkakarla.ckeditor5

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.LinearLayout

class CkEditor5(context: Context?, attrs: AttributeSet?) :
    LinearLayout(context, attrs), CKEditorDataInterface {
    private var webView:WebView
    private var CKEditorDataInterface:CKEditorDataInterface?= context as CKEditorDataInterface
    init {
        inflate(context,R.layout.activity_ckeditor,this)
        webView = findViewById<WebView>(R.id.webview);
        webView.settings.javaScriptEnabled=true
        var jsBridge = JSBridge(this)
        webView.addJavascriptInterface(jsBridge,"JSBridge")
    }



    fun sendDataToCKEditor5(value:String,readOnly:Boolean){
        webView.loadUrl("file:///android_asset/editorHtml/index.html")
        webView.webViewClient= object : WebViewClient(){
            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    if(readOnly){
                        webView.evaluateJavascript(
                            "javascript: " +"editorText.setData('"+value+"');editorText.isReadOnly = true;",null)
                    }else{
                        webView.evaluateJavascript(
                            "javascript: " +"editorText.setData('"+value+"');",null)
                    }

                }
            }
        }
    }


    override fun sendDataClass(data: String) {
        CKEditorDataInterface!!.sendDataClass(data)
    }


}
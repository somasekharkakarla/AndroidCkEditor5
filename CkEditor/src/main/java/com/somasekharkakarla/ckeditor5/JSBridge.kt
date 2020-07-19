package com.somasekharkakarla.ckeditor5

import android.webkit.JavascriptInterface

class JSBridge(ckEditor5: CkEditor5) {

    var dataCkEditor: String?=null
    var CKEditorDataInterface:CKEditorDataInterface?=ckEditor5;

    @JavascriptInterface
    fun showMessageInNative(message:String){
        dataCkEditor=message;
        CKEditorDataInterface!!.getDataFromEditor(message)
    }


}
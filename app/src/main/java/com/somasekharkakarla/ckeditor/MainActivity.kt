package com.somasekharkakarla.ckeditor

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.somasekharkakarla.ckeditor.databinding.ActivityMainBinding
import com.somasekharkakarla.ckeditor5.CKEditorDataInterface

class MainActivity : AppCompatActivity(),CKEditorDataInterface {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        activityMainBinding.ckeditot.sendDataToCKEditor5("<p>asdfasdfasdf</p>",false);
    }

    override fun getDataFromEditor(data: String) {
        Log.d("TAG", "sendDataClass:InProject "+data)
    }
}
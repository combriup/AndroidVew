package com.yimeng.aartestdemo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG123", "onCreate: " + "我是v1.0.2分支的内容");
        Log.i("TAG123", "onCreate: " + "我是master分支的内容");
    }

}
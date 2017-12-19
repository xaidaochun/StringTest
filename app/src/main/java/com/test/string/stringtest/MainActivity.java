package com.test.string.stringtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView  tv= (TextView) findViewById(R.id.textView2);
        tv.setText(R.string.app_txt);//在代码中使用资源文件
    }
}

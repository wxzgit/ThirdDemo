package com.wxz.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/1/26.
 */
public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = " hello !";
        Toast.makeText(this,"why not ！",Toast.LENGTH_LONG).show();
    }
}

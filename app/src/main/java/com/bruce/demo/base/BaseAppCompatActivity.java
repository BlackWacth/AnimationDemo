package com.bruce.demo.base;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.bruce.demo.R;

/**
 * 基类
 * Created by Bruce on 2017/6/9.
 */
public class BaseAppCompatActivity extends AppCompatActivity {

    protected void setupToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.tb_toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
}

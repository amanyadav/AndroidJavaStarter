package com.example.starter.ui.activity;

import android.os.Bundle;
import android.util.Log;

import com.example.starter.R;
import com.example.starter.ui.base.BaseActivity;
import com.example.starter.util.MyPreferenceManager;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {
    @Inject
    MyPreferenceManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("sdf", manager.getSharedPrefs());
    }
}

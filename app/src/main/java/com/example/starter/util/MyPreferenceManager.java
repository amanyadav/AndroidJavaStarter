package com.example.starter.util;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class MyPreferenceManager {

    @Inject
    public MyPreferenceManager() {
    }

    public String getSharedPrefs() {
        return "hello";
    }
}

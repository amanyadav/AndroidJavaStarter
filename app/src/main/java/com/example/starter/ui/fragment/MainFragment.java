package com.example.starter.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.starter.R;
import com.example.starter.ui.base.BaseFragment;
import com.example.starter.util.MyPreferenceManager;

import javax.inject.Inject;

import timber.log.Timber;

public class MainFragment extends BaseFragment {

    @Inject
    MyPreferenceManager manager;

    public MainFragment() {
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Timber.i(manager.getSharedPrefs());
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}

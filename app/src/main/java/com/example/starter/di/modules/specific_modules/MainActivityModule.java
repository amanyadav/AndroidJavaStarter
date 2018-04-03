package com.example.starter.di.modules.specific_modules;

import android.app.Activity;

import com.example.starter.di.modules.base_module.BaseActivityModule;
import com.example.starter.di.scopes.PerActivity;
import com.example.starter.di.scopes.PerFragment;
import com.example.starter.ui.activity.MainActivity;
import com.example.starter.ui.fragment.MainFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    @PerFragment
    @ContributesAndroidInjector(modules = MainFragmentModule.class)
    abstract MainFragment mainFragmentInjector();

    @Binds
    @PerActivity
    abstract Activity activity(MainActivity mainActivity);
}
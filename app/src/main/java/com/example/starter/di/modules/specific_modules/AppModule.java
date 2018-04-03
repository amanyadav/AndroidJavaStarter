package com.example.starter.di.modules.specific_modules;

import com.example.starter.di.scopes.PerActivity;
import com.example.starter.ui.activity.MainActivity;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

/**
 * This module will provide dependencies to all activities
 * So if you want some activity to involve in dependency injection then add that activity here
 * Also define which activity module it is using to provide dependencies.
 */
@Module(includes = AndroidInjectionModule.class)
public abstract class AppModule {

    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();

}
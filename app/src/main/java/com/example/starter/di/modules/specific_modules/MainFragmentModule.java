package com.example.starter.di.modules.specific_modules;

import android.app.Fragment;

import com.example.starter.di.modules.base_module.BaseFragmentModule;
import com.example.starter.di.scopes.PerFragment;
import com.example.starter.ui.fragment.MainFragment;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;

@Module(includes = BaseFragmentModule.class)
public abstract class MainFragmentModule {

    @Binds
    @Named(BaseFragmentModule.FRAGMENT)
    @PerFragment
    abstract Fragment fragment(MainFragment mainFragment);
}
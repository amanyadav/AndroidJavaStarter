package com.example.starter.di.modules;

import com.example.starter.App;
import com.example.starter.di.modules.specific_modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);
}
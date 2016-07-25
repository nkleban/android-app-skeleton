package net.intellectsoft.skeleton.injection.components;


import net.intellectsoft.skeleton.injection.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        AppModule.class,
})
public interface AppComponent {

    /**
     * Define here targets for injection, for example:
     *
     * void inject(MainActivity mainActivity);
     *
     */

}
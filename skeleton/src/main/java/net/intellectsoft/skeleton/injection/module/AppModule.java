package net.intellectsoft.skeleton.injection.module;

import android.app.Application;
import android.content.Context;

import net.intellectsoft.skeleton.injection.AppContext;

import dagger.Module;
import dagger.Provides;

/**
 * Provide application-level dependencies.
 */
@Module
public class AppModule {

    protected final Context context;

    public AppModule(Application application) {
        this.context = application.getApplicationContext();
    }

    @Provides
    @AppContext
    Context provideContext() {
        return context;
    }

}
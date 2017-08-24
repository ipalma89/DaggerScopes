package com.ipalma.daggerscopes.di.module;

import android.app.Activity;

import com.ipalma.daggerscopes.di.scope.ActivityScope;

import java.util.Date;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ipalma on 8/24/17.
 */
@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public Activity activity() {
        return activity;
    }

    @Provides
    @ActivityScope
    public Date date() {
        return new Date();
    }
}

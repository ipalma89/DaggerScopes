package com.ipalma.daggerscopes.di.component;

import com.ipalma.daggerscopes.MainActivity;
import com.ipalma.daggerscopes.di.module.ActivityModule;
import com.ipalma.daggerscopes.di.scope.ActivityScope;
import com.ipalma.daggerscopes.model.DateManager;

import dagger.Component;

/**
 * Created by ipalma on 8/24/17.
 */
@ActivityScope
@Component(modules = {ActivityModule.class}, dependencies = AppComponent.class)
public interface ActivityComponent {

    void injectMainActivity(MainActivity mainActivity);

    DateManager dateManager();

}

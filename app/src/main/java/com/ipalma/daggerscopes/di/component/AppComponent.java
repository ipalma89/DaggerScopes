package com.ipalma.daggerscopes.di.component;

import com.ipalma.daggerscopes.di.module.ApiModule;
import com.ipalma.daggerscopes.di.module.UserModule;
import com.ipalma.daggerscopes.di.scope.AppScope;
import com.ipalma.daggerscopes.model.ApiClient;
import com.ipalma.daggerscopes.model.User;

import dagger.Component;

/**
 * Created by ipalma on 8/23/17.
 */
@AppScope
@Component(modules = {UserModule.class, ApiModule.class})
public interface AppComponent {

    User getUser();

    ApiClient getApiClient();

}

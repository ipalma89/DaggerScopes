package com.ipalma.daggerscopes;

import android.app.Application;

import com.ipalma.daggerscopes.di.component.AppComponent;
import com.ipalma.daggerscopes.di.component.DaggerAppComponent;
import com.ipalma.daggerscopes.model.ApiClient;
import com.ipalma.daggerscopes.model.User;

/**
 * Created by ipalma on 8/23/17.
 */

public class MyApplication extends Application {

    public AppComponent getComponent() {
        return component;
    }

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder().build();

        ApiClient apiClient = component.getApiClient();
        ApiClient apiClient2 = component.getApiClient();
        ApiClient apiClient3 = component.getApiClient();

        User user = component.getUser();
        User user2 = component.getUser();
        User user3 = component.getUser();
    }
}

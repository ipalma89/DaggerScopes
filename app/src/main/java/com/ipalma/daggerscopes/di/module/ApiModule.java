package com.ipalma.daggerscopes.di.module;

import com.ipalma.daggerscopes.di.scope.AppScope;
import com.ipalma.daggerscopes.model.ApiClient;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ipalma on 8/24/17.
 */
@Module
public class ApiModule {

    @Provides
    @AppScope
    ApiClient apiClient() {
        return new ApiClient();
    }
}

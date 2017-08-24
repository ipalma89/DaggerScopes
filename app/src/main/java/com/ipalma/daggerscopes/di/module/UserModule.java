package com.ipalma.daggerscopes.di.module;

import com.ipalma.daggerscopes.di.scope.AppScope;
import com.ipalma.daggerscopes.model.Address;
import com.ipalma.daggerscopes.model.User;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ipalma on 8/24/17.
 */
@Module
public class UserModule {

    @Provides
    @AppScope
    public User user(Address address) {
        return new User(address);
    }

}

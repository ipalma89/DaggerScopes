package com.ipalma.daggerscopes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ipalma.daggerscopes.di.component.ActivityComponent;
import com.ipalma.daggerscopes.di.component.DaggerActivityComponent;
import com.ipalma.daggerscopes.di.module.ActivityModule;
import com.ipalma.daggerscopes.model.DateManager;
import com.ipalma.daggerscopes.model.User;

import java.util.Date;

import javax.inject.Inject;

public class MainActivity extends Activity {

    private ActivityComponent component;

    @Inject
    DateManager dateManager;

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .appComponent(((MyApplication)getApplication()).getComponent())
                .build();

        component.injectMainActivity(this);
        component.dateManager();

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(new Date().toString());
    }

    public void login(View view) {

    }

    public void logout(View view) {

    }

    public void open(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}

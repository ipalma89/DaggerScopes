package com.ipalma.daggerscopes.model;

import android.app.Activity;

import java.util.Date;

import javax.inject.Inject;

/**
 * Created by ipalma on 8/24/17.
 */

public class DateManager {
    public Activity activity;
    public Date date;

    @Inject
    public DateManager(Activity activity, Date date) {
        this.activity = activity;
        this.date = date;
    }
}

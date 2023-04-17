package com.shachar_dev.common;

import android.app.Application;

public abstract class App_Parent extends Application {

    protected static Class<?> statsClass;

    @Override
    public void onCreate() {
        super.onCreate();
        MSP.initHelper(this);
    }
}

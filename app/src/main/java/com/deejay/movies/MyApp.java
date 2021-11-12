package com.deejay.movies;

import android.app.Application;

import com.onesignal.OneSignal;

public class MyApp extends Application {
    private static final String ONESIGNAL_APP_ID = "46d7cc90-adcc-4753-8490-acd4b5ae97bc";

    @Override
    public void onCreate() {
        super.onCreate();
        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);



    }


}

package com.marswin89.marsdaemon.demo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * DO NOT do anything in this Service!<br/>
 * <p>
 * Created by Mars on 12/24/15.
 */
public class Service2 extends Service {
    public static final String TAG = "Service1";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Service2:onCreate----------------");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return Service.START_NOT_STICKY;
    }
}

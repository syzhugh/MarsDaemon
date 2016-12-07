package com.marswin89.marsdaemon.demo.newidea;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by ZS27 on 2016/12/7.
 */

public class IdeaService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("info", "IdeaService:onCreate----------------------");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("info", "IdeaService:onStartCommand----------------------");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

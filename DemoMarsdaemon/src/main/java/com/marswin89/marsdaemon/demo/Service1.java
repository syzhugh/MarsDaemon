package com.marswin89.marsdaemon.demo;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;

import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.xiaomi.mipush.sdk.MiPushClient;

import java.util.List;

/**
 * This Service is Persistent Service. Do some what you want to do here.<br/>
 * <p>
 * Created by Mars on 12/24/15.
 */
public class Service1 extends Service {
    public static final String TAG = "com.marswin89.marsdaemon.demo";
    public static final String APP_ID = "2882303761517530836";
    public static final String APP_KEY = "5491753048836";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("info", "Service1:onCreate----------------------");
        //初始化push推送服务
        if (shouldInit()) {
//            MiPushClient.registerPush(this, APP_ID, APP_KEY);
        }
        //打开Log
        LoggerInterface newLogger = new LoggerInterface() {

            @Override
            public void setTag(String tag) {
                // ignore
            }

            @Override
            public void log(String content, Throwable t) {
            }

            @Override
            public void log(String content) {
            }
        };
        Logger.setLogger(this, newLogger);
    }

    private boolean shouldInit() {
        ActivityManager am = ((ActivityManager) getSystemService(Context.ACTIVITY_SERVICE));
        List<ActivityManager.RunningAppProcessInfo> processInfos = am.getRunningAppProcesses();
        String mainProcessName = getPackageName();
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo info : processInfos) {
            if (info.pid == myPid && mainProcessName.equals(info.processName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

package com.marswin89.marsdaemon.demo.mipush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.mipush.sdk.PushMessageReceiver;

/**
 * Created by ZS27 on 2016/12/6.
 */

public class MReceiver extends PushMessageReceiver {
    public static final int L2 = 2;
    public static final int L3 = 3;
    public static final int PIC = 4;
    public static final int VIDEO = 5;


    /*消息到达*/
    @Override
    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
        super.onReceiveMessage(context, miPushMessage);
        Log.i("info", "MReceiver:消息到达----------------------");
        Log.i("info", ":" + miPushMessage.toString());
    }

    /*透传消息*/
    @Override
    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
        super.onReceivePassThroughMessage(context, miPushMessage);
        Log.i("info", "MReceiver:消息透传----------------------");
        Log.i("info", ":" + miPushMessage.toString());
    }

    /*通知栏消息到达*/
    @Override
    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageArrived(context, miPushMessage);
        Log.i("info", "MReceiver:通知栏消息到达----------------------");
        Log.i("info", ":" + miPushMessage.toString());
    }

    /*通知栏点击*/
    @Override
    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
        super.onNotificationMessageClicked(context, miPushMessage);
        Log.i("info", "MReceiver:通知栏消息点击----------------------");
        Log.i("info", ":" + miPushMessage.toString());

    }


    /*注册回执*/
    @Override
    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        super.onReceiveRegisterResult(context, miPushCommandMessage);
        Log.i("info", "MReceiver:用户注册回执----------------------");
        Log.i("info", ":" + miPushCommandMessage.toString());
    }

    /*命令回执*/
    @Override
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
        super.onCommandResult(context, miPushCommandMessage);
        Log.i("info", "MReceiver:用户命令回执----------------------");
        Log.i("info", ":" + miPushCommandMessage.toString());
    }

}
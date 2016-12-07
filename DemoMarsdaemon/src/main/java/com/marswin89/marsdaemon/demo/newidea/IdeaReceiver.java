package com.marswin89.marsdaemon.demo.newidea;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by ZS27 on 2016/12/7.
 */

public class IdeaReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("info", "IdeaReceiver:onReceive----------------------");
        Intent intent1 = new Intent();
        intent1.setClassName(context, "com.marswin89.marsdaemon.demo.newidea.IdeaService");
        context.startService(intent1);
    }
}

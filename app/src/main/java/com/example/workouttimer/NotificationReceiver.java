package com.example.workouttimer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("NOTIFICATION", "clicked");
        context.sendBroadcast(new Intent("NEXT"));
    }
}

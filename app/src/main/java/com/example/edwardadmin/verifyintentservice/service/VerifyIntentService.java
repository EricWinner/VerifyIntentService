package com.example.edwardadmin.verifyintentservice.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by EdwardAdmin on 2017/10/12.
 */

public class VerifyIntentService extends IntentService {

    private static final String TAG = "VerifyIntentService";
    private static final String SERVICE_NAME = "VerifyService";

    public static final String MSG_TASK_FIRST = "msg_task_first";
    public static final String MSG_TASK_SECOND = "msg_task_second";
    public static final String TASK_NAME = "Task_Name";

    public VerifyIntentService() {
        super(SERVICE_NAME);
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Log.d(TAG, "onStart");
        super.onStart(intent, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind");
        return super.onBind(intent);
    }

    @Override
    public void setIntentRedelivery(boolean enabled) {
        super.setIntentRedelivery(enabled);
        Log.d(TAG, "setIntentRedelivery");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String taskName = intent.getExtras().getString(TASK_NAME);
        switch (taskName) {
            case MSG_TASK_FIRST:
                Log.d(TAG, "start task 1");
                break;
            case MSG_TASK_SECOND:
                Log.d(TAG, "start task 2");
                break;
            default:
                break;
        }
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

}

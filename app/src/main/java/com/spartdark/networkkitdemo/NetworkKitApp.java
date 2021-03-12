package com.spartdark.networkkitdemo;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.multidex.MultiDex;

import com.huawei.hms.network.NetworkKit;

public class NetworkKitApp extends Application {

    private static final String TAG = "NetworkKitApp";

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        // Asynchronously load and initialize Network Kit. The kit needs to be initialized once only.
        NetworkKit.init(
                getApplicationContext(),
                new NetworkKit.Callback() {
                    @Override
                    public void onResult(boolean result) {
                        if (result) {
                            Log.i(TAG, "init success");
                        } else {
                            Log.i(TAG, "init failed");
                        }
                    }
                });
    }
}

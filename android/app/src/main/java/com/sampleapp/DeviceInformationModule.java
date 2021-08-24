package com.sampleapp;

import android.util.Log;
import android.os.Build;	

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
public class DeviceInformationModule extends ReactContextBaseJavaModule {
    public DeviceInformationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override	
    public String getName() {	
        return "DeviceInformation";	
    }	
    @ReactMethod	
    public void getOSInfo(Callback callback) {	
        // Androidでは、JavaScriptへの返り値を 可変長引数で渡す。
        callback.invoke("android",Build.VERSION.RELEASE);
        // IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        // Intent intent = getReactApplicationContext().registerReceiver(null, intentFilter);
        // // 電池残量
        // int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        // String battery_info = "残量" + level + "%" + "\n";
        // // Androidでは、JavaScriptへの返り値を 可変長引数で渡す。
        // callback.invoke("android",battery_info);    
    }
}
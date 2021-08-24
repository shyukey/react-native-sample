package com.sampleapp;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CounterModule extends ReactContextBaseJavaModule {
    public CounterModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void increment(int origin, Callback callback) {
        int count = origin + 1;
        Log.d("DEBUG", String.format("---------- count is (%s)", count));
        callback.invoke(count);
    }

    @ReactMethod
    public void decrement(int origin, Promise promise) {
        if (origin == 0) {
            promise.reject("E_COUNT", "You can't decrement any more!!");
        } else {
            int count = origin - 1;
            Log.d("DEBUG", String.format("---------- count is (%s)", count));
            promise.resolve(count);
        }
    }

    @NonNull
    @Override
    public String getName() {
        return "Counter";
    }
}
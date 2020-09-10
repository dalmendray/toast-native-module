package com.fbc.ui;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ToastModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public ToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Toast";
    }

    @ReactMethod
    public void toast(String stringArgument) {
        Toast.makeText(reactContext, stringArgument, Toast.LENGTH_SHORT).show();
    }
}

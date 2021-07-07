package com.example.httpprocessor_20200413;

import android.app.Application;

import com.example.httpprocessor_20200413.http.HttpHelper;
import com.example.httpprocessor_20200413.http.httpprocessor.impl.OkHttpProcessor;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
//        HttpHelper.init(new VolleyProcessor(this));
//        HttpHelper.init(new XUtilsProcessor(this));
        HttpHelper.init(new OkHttpProcessor());
    }
}

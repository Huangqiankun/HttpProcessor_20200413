package com.example.httpprocessor_20200413.http.httpprocessor.impl;

import com.example.httpprocessor_20200413.http.ICallback;
import com.example.httpprocessor_20200413.http.httpprocessor.IHttpProcessor;

import java.util.Map;

public class OtherProcessor implements IHttpProcessor {
    @Override
    public void post(String url, Map<String, Object> params, ICallback callback) {
        //.....
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallback callback) {

    }
}

package com.example.httpprocessor_20200413.http.httpprocessor.impl;

import com.example.httpprocessor_20200413.http.ICallback;
import com.example.httpprocessor_20200413.http.httpprocessor.IHttpProcessor;
import com.example.httpprocessor_20200413.MyApplication;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.Map;

public class XUtilsProcessor implements IHttpProcessor {

    public XUtilsProcessor(MyApplication app){
        x.Ext.init(app);
    }

    @Override
    public void post(String url, Map<String, Object> params,final ICallback callback) {
        RequestParams requestParams=new RequestParams(url);
        x.http().post(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                callback.onSuccess(result);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallback callback) {

    }
}

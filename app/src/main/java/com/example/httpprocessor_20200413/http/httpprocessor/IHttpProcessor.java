package com.example.httpprocessor_20200413.http.httpprocessor;

import com.example.httpprocessor_20200413.http.ICallback;

import java.util.Map;

/**
 * 房产公司
 */
public interface IHttpProcessor {
    //有卖房的能力
    //网络访问的能力
    void post(String url, Map<String,Object> params, ICallback callback);
    void get(String url, Map<String,Object> params,ICallback callback);
}

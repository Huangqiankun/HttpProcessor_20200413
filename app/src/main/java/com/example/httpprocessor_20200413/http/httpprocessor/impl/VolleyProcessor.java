package com.example.httpprocessor_20200413.http.httpprocessor.impl;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.httpprocessor_20200413.http.ICallback;
import com.example.httpprocessor_20200413.http.httpprocessor.IHttpProcessor;

import java.util.Map;

/**
 * 真实的操作在这里
 * 业主
 */
public class VolleyProcessor implements IHttpProcessor {

    private static RequestQueue mQueue=null;
    public VolleyProcessor(Context context){
        mQueue= Volley.newRequestQueue(context);
    }

    @Override
    public void post(String url, Map<String, Object> params,final ICallback callback) {
        StringRequest stringRequest=new StringRequest(Request.Method.POST,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        callback.onSuccess(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        mQueue.add(stringRequest);
    }

    @Override
    public void get(String url, Map<String, Object> params, ICallback callback) {

    }
}

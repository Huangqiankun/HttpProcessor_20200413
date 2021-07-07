package com.example.httpprocessor_20200413;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.httpprocessor_20200413.bean.ResponceData;
import com.example.httpprocessor_20200413.http.HttpCallback;
import com.example.httpprocessor_20200413.http.HttpHelper;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        String url="https://v.juhe.cn/historyWeather/citys";
        HashMap<String,Object> params=new HashMap<>();
        //https://v.juhe.cn/historyWeather/citys?&province_id=2&key=bb52107206585ab074f5e59a8c73875b
        params.put("province_id","2");
        params.put("key","bb52107206585ab074f5e59a8c73875b");
        HttpHelper.obtain().post(url, params, new HttpCallback<ResponceData>() {
            @Override
            public void onSuccess(ResponceData objResult) {
                Toast.makeText(MainActivity.this, objResult.getResultcode(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(String e) {
                super.onFailure(e);
            }
        });

    }
}









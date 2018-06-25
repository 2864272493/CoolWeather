package com.coolweather.android.util;

import javax.security.auth.callback.Callback;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by xiaos on 2018/3/11.
 */

public class HttpUtil {
    //天气接口的key
    public static final String KEYROOT = "&key=1444b81dc5e54827a395e1208cd3f617";

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

package com.example.demotext;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by 赵瑞波 on 2018/3/5.
 */

public class OkHttpUntils {

        private static OkHttpUntils utils;
        private OkHttpClient client;
        private OkHttpUntils(){
            client = new OkHttpClient.Builder().build();
        }
        public static synchronized OkHttpUntils getInstance(){
            if(utils ==null)
                utils = new OkHttpUntils();
            return utils;
        }
        public void sendGet(String url, Callback callback){
            Request request = new Request.Builder().url(url).build();
            Call call = client.newCall(request);
            call.enqueue(callback);
        }
        public void sendPost(String url, RequestBody body, Callback callback){
            Request request = new Request.Builder().url(url)
                    //                .post(body)
                    .method("POST",body)
                    .build();
            Call call = client.newCall(request);
            call.enqueue(callback);
        }
}

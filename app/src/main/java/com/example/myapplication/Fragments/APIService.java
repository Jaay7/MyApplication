package com.example.myapplication.Fragments;

import com.example.myapplication.Notifications.MyResponse;
import com.example.myapplication.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAMTGgtfM:APA91bFsocGb6Gaw6T3pGjGAHyUMkVemej3JDzsRxzPTRJywNDaatPk_JUSL5Z-MJLDq7xyluYZwc2T4lXDDVBlmJ-7iQYXXTNGIY3g7IqNtgDfCwwMp4-8aVmZd-oHLcGp-IQHx1PfB"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

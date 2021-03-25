package com.example.javachatapp.Fragments;

import retrofit2.http.Headers;

public class APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAe85b_A0:APA91bFggpuuF9EiwffU8Cwbv4_AiZgaxPaLiJV1-Tjf7kL4BnB8m0egb9-Hc7VXEfjo-eLX57Of1tvv-0-Iw_yHyB1KJ80I-FYCkZkOefMl1JTOKV1KOP1AI6YYz11ydfQWQOZOiWbD\t\n"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

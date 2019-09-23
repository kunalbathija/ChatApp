package com.kunal.chatapp.Fragments;

import com.kunal.chatapp.Notifications.MyResponse;
import com.kunal.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by MANISH on 19-09-2019.
 */

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAH0xDQdw:APA91bFXm9xpzcxdEwrgo9YleinhJwdjzS1GuNKDWIAHn9ppxnmb8DsQhPCPUJXozFUdC2ZR2K-FaVIsBbP9flTZG7euHlR4kW0BaxgJ2lr9VPu7Wll_1FgwxlizBsOuJFZVSlo-f-6J"
            }
    )


    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}

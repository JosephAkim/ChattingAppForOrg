package com.kim.chattingappfororg.network;

import retrofit2.Retrofit;

public class ApiClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://fcm.googleapis.com/fcm/")
                    .addConverterFactory(ScalarConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

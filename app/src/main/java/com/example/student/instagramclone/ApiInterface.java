package com.example.student.instagramclone;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by USER on 7/1/2017.
 */

public interface ApiInterface {

    @GET("/contacts")
    Call<Users> getUsers();
}

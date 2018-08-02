package com.m.demoupload;

import com.google.gson.JsonObject;

import java.io.File;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {


    // Basic YWRtaW46YWRtaW4=

    @Multipart
    @POST("wp-json/wp/v2/media/")
    Call<JsonObject> getMovieDetails(@Header("Authorization") String header, @Part MultipartBody.Part file);

}

package com.example.tugasretrofitjson;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderAPI {
    @GET("siswa")
    Call<List<Post>> getPost();
    //Call<List<Post>> getPost(@Query("id_siswa") String id_siswa);

    @FormUrlEncoded
    @POST("siswa")
    Call<ResponseBody> addDataMhs(
      @Field("id_siswa") String id_siswa,
      @Field("nama") String nama,
      @Field("alamat") String alamat,
      @Field("jenis_kelamin") String jenis_kelamin,
      @Field("no_telp") String no_telp
    );

    @FormUrlEncoded
    @PUT("siswa")
    Call<ResponseBody> updateDataMhs(
            @Field("id_siswa") String id_siswa,
            @Field("nama") String nama,
            @Field("alamat") String alamat,
            @Field("jenis_kelamin") String jenis_kelamin,
            @Field("no_telp") String no_telp
    );
}

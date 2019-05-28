package com.niyagrace.aplikasiii.util.api;

public class UtilsApi {

    // 192.168.1.9 ini adalah localhost.
    public static final String BASE_URL_API = "http://192.168.1.4/rest-api/API-mahasiswa-master/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}

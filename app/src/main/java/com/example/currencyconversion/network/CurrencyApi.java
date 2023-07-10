package com.example.currencyconversion.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CurrencyApi {

    public CurrencyApiService createCurrencyApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.freecurrencyapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CurrencyApiService currencyApiService = retrofit.create(CurrencyApiService.class);
        return currencyApiService;
    }
}

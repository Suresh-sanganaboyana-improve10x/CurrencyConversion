package com.example.currencyconversion.network;

import com.example.currencyconversion.CurrencyData;

import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CurrencyApiService {
    @GET("v1/latest?apikey=S5IH9G2OYCzbrmEZlG57AdlfeNf9DqCkWFYB96AH")
    Call<CurrencyData> getCurrencies();
}

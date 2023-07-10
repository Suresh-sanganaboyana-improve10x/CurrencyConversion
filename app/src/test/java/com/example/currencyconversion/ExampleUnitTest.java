package com.example.currencyconversion;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.currencyconversion.modelclasses.CurrencyData;
import com.example.currencyconversion.network.CurrencyApi;
import com.example.currencyconversion.network.CurrencyApiService;
import com.google.gson.Gson;

import java.io.IOException;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getCurrencyConversion() throws IOException {
        CurrencyApi currencyApi = new CurrencyApi();
        CurrencyApiService currencyApiService = currencyApi.createCurrencyApiService();
        Call<CurrencyData> call = currencyApiService.getCurrencies();
        CurrencyData currencyData = call.execute().body();
        assertNotNull(currencyData);
        System.out.println(new Gson().toJson(currencyData));
    }
}
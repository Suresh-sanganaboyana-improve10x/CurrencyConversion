package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.currencyconversion.databinding.ActivityCurrenciesConverterBinding;

public class CurrenciesConverterActivity extends AppCompatActivity {

    private ActivityCurrenciesConverterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCurrenciesConverterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
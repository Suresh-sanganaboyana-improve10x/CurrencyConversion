package com.example.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.currencyconversion.databinding.ActivityCurrenciesConverterBinding;

import java.util.ArrayList;

public class CurrenciesConverterActivity extends AppCompatActivity {

    private ArrayList<String> currencyList;
    private ArrayAdapter<String> arrayAdapter;
    private ActivityCurrenciesConverterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCurrenciesConverterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setCurrencyList();
        setupAdapter();
    }

    private void setCurrencyList() {
        currencyList = new ArrayList<>();
        currencyList.add("australianDollar(AUD)");
        currencyList.add("bulgarianLev(BGN)");
        currencyList.add("brazilianReal(BRL)");
        currencyList.add("canadianDollar(CAD)");
        currencyList.add("swissFranc(CHF)");
        currencyList.add("chineseYuan(CNY)");
        currencyList.add("czechKoruna(CZK)");
        currencyList.add("danishKrone(DKK)");
        currencyList.add("euro(EUR)");
        currencyList.add("poundSterling(GBP)");
        currencyList.add("hongKongDollar(HKD)");
        currencyList.add("croatianKuna(HRK)");
        currencyList.add("hungarianForint(HUF)");
        currencyList.add("indonesianRupiah(IDR)");
        currencyList.add("israeliNewShekel(ILS)");
        currencyList.add("indianRupee(INR)");
        currencyList.add("icelandicKrona(ISK)");
        currencyList.add("japaneseYen(JPY)");
        currencyList.add("southKoreanWon(KRW)");
        currencyList.add("mexicanPeso(MXN)");
        currencyList.add("newZealandDollar(NOK)");
        currencyList.add("philippinePeso(PHP)");
        currencyList.add("polishZloty(PLN)");
        currencyList.add("romanianLeu(RON)");
        currencyList.add("russianRuble(RUB)");
        currencyList.add("swedishKrona(SEK)");
        currencyList.add("singaporeDollar(SGD)");
        currencyList.add("thaiBaht(THB)");
        currencyList.add("turkishLira(TRY)");
        currencyList.add("unitedStatesDollar(USD)");
        currencyList.add("southAfricanRand(ZAR)");
    }

    private void setupAdapter() {
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, currencyList);
        binding.fromSp.setAdapter(arrayAdapter);
        binding.toSp.setAdapter(arrayAdapter);
        binding.fromSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
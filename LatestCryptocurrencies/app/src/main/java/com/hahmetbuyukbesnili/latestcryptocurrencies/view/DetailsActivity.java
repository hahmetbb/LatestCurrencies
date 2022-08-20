package com.hahmetbuyukbesnili.latestcryptocurrencies.view;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.hahmetbuyukbesnili.latestcryptocurrencies.R;
import com.hahmetbuyukbesnili.latestcryptocurrencies.databinding.ActivityDetailsBinding;
import com.hahmetbuyukbesnili.latestcryptocurrencies.model.CryptoTestModel;
import com.hahmetbuyukbesnili.latestcryptocurrencies.view.main.PageViewModel;
import com.hahmetbuyukbesnili.latestcryptocurrencies.view.main.SectionsPagerAdapter;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    PageViewModel pageViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

        CryptoTestModel cryptoModel = (CryptoTestModel) getIntent().getSerializableExtra("json");

        String backgroundColor = getIntent().getStringExtra("backgroundColor");

        pageViewModel = new ViewModelProvider(this).get(PageViewModel.class);
        binding.linearLayout.setBackgroundColor(Color.parseColor(backgroundColor));
        binding.tabs.setBackgroundColor(Color.parseColor(backgroundColor));
        binding.tabs.setSelectedTabIndicatorColor(getColor(R.color.white));

        binding.tCrypto.setText(cryptoModel.getName());
        binding.tCurrency.setText(cryptoModel.getCurrency());
        binding.tPrice.setText(cryptoModel.getPrice());
        Glide.with(this).load(cryptoModel.getLogoUrl()).into(binding.ivCryptos);
    }
}
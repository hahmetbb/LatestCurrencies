package com.hahmetbuyukbesnili.latestcryptocurrencies.view.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.hahmetbuyukbesnili.latestcryptocurrencies.R;
import com.hahmetbuyukbesnili.latestcryptocurrencies.model.CryptoTestModel;

public class DailyFragment extends Fragment {

    PageViewModel pageViewModel;
    TextView textView;


    public static DailyFragment newInstance() {
        return new DailyFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pageViewModel = new ViewModelProvider(requireActivity()).get(PageViewModel.class);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_daily, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = view.findViewById(R.id.textDaily);

       // Log.d("TAG", cryptoModel.getLogoUrl());
    }
}
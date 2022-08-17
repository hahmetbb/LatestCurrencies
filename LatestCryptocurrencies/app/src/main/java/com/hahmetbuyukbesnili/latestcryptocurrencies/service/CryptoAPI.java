package com.hahmetbuyukbesnili.latestcryptocurrencies.service;

import com.hahmetbuyukbesnili.latestcryptocurrencies.BuildConfig;
import com.hahmetbuyukbesnili.latestcryptocurrencies.model.CryptoTestModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("currencies/ticker?key=" + BuildConfig.TOKEN)
    Observable<List<CryptoTestModel>> getData();
}

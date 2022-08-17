package com.hahmetbuyukbesnili.latestcryptocurrencies.service;

import com.hahmetbuyukbesnili.latestcryptocurrencies.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {

    @GET("currencies/ticker?key=20146f6969d72388967edb912eba519388ae17a9")
    Observable<List<CryptoModel>> getData();
}

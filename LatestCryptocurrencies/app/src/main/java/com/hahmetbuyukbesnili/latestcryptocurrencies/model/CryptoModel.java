package com.hahmetbuyukbesnili.latestcryptocurrencies.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("name")
    public String name;

    @SerializedName("currency")
    public String currency;

    @SerializedName("price")
    public String price;

    @SerializedName("logo_url")
    public String logo;
}

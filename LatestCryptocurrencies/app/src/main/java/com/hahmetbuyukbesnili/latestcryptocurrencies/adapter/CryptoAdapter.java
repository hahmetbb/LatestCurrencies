package com.hahmetbuyukbesnili.latestcryptocurrencies.adapter;

import android.graphics.Color;
import android.graphics.drawable.PictureDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

import com.bumptech.glide.Glide;
import com.hahmetbuyukbesnili.latestcryptocurrencies.databinding.RecyclerRowBinding;
import com.hahmetbuyukbesnili.latestcryptocurrencies.model.CryptoTestModel;

import java.util.ArrayList;

public class CryptoAdapter extends RecyclerView.Adapter<CryptoAdapter.CryptoHolder> {

    private String[] colors = {"#b33356", "#c9d6ff", "#a06020", "#321123", "#8ec127", "#dab2b1"};
    private ArrayList<CryptoTestModel> cryptoList;

    public CryptoAdapter(ArrayList<CryptoTestModel> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public CryptoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CryptoHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoHolder holder, int position) {
        holder.bind(cryptoList.get(position), colors, position);
    }

    @Override
    public int getItemCount() {
        return cryptoList.size();
    }

    public class CryptoHolder extends RecyclerView.ViewHolder {

        private RecyclerRowBinding binding;

        public CryptoHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(CryptoTestModel cryptoModel, String[] colors, Integer position) {
            itemView.setBackgroundColor(Color.parseColor(colors[position % 6]));
            binding.nameText.setText(cryptoModel.getName());
            binding.currencyText.setText(cryptoModel.getCurrency());
            binding.priceText.setText(cryptoModel.getPrice());

            CircularProgressDrawable circularProgressDrawable1 = new CircularProgressDrawable(itemView.getContext());
            circularProgressDrawable1.setStrokeWidth(5f);
            circularProgressDrawable1.setCenterRadius(30f);
            circularProgressDrawable1.start();

            if (cryptoModel.getLogoUrl().contains("svg")) {
                Glide.with(itemView.getContext())
                        .as(PictureDrawable.class)
                        .load(cryptoModel.getLogoUrl())
                        .placeholder(circularProgressDrawable1)
                        .into(binding.ivCoin);
            } else {
                Glide.with(itemView.getContext())
                        .load(cryptoModel.getLogoUrl())
                        .placeholder(circularProgressDrawable1)
                        .into(binding.ivCoin);
            }

            Log.d("TAG", cryptoModel.getLogoUrl());

        }
    }
}

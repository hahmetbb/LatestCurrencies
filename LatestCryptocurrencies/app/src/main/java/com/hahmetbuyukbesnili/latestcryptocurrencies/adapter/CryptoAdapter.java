package com.hahmetbuyukbesnili.latestcryptocurrencies.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.hahmetbuyukbesnili.latestcryptocurrencies.databinding.RecyclerRowBinding;
import com.hahmetbuyukbesnili.latestcryptocurrencies.model.CryptoModel;
import com.hahmetbuyukbesnili.latestcryptocurrencies.view.MainActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CryptoAdapter extends RecyclerView.Adapter<CryptoAdapter.CryptoHolder> {

    private String[] colors = {"#b33356","#c9d6ff","#a06020","#321123","#8ec127","#dab2b1"};
    private ArrayList<CryptoModel> cryptoList;

    public CryptoAdapter(ArrayList<CryptoModel> cryptoList) {
        this.cryptoList = cryptoList;
    }

    @NonNull
    @Override
    public CryptoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new CryptoHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoHolder holder, int position) {
        holder.bind(cryptoList.get(position),colors,position);

    }

    @Override
    public int getItemCount() {
        return cryptoList.size();
    }

    public class CryptoHolder extends RecyclerView.ViewHolder{
        RecyclerRowBinding binding;
        public CryptoHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(CryptoModel cryptoModel, String[] colors, Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position %6]));
            binding.nameText.setText(cryptoModel.name);
            binding.currencyText.setText(cryptoModel.currency);
            binding.priceText.setText(cryptoModel.price);
            Picasso.get().load(cryptoModel.logo).into(binding.imageView);
            //Glide.with(itemView).load(cryptoModel.logo).into(binding.imageView);

            System.out.println(cryptoModel.logo);



        }
    }
}

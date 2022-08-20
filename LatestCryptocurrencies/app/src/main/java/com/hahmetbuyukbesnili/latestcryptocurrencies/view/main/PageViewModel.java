package com.hahmetbuyukbesnili.latestcryptocurrencies.view.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.hahmetbuyukbesnili.latestcryptocurrencies.model.CryptoTestModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<CryptoTestModel.D> nameInput = new MutableLiveData<>();

    public void setDay(CryptoTestModel.D day){
        nameInput.setValue(day);
    }

    public LiveData<CryptoTestModel.D> getDay(){
        return nameInput;
    }

    public void setMonth(CryptoTestModel.D month){
        nameInput.setValue(month);
    }

    public LiveData<CryptoTestModel.D> getMonth(){
        return nameInput;
    }

    public void setYear(CryptoTestModel.D year){
        nameInput.setValue(year);
    }

    public LiveData<CryptoTestModel.D> getYear(){
        return nameInput;
    }

    /*
    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            return "Hello world from section: " + input;
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }

     */
}
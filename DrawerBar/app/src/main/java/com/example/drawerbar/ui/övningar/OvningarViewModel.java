package com.example.drawerbar.ui.övningar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OvningarViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public OvningarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Övningar fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.example.drawerbar.ui.övningar;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.drawerbar.R;
import com.example.drawerbar.ui.slideshow.SlideshowViewModel;

public class OvningarFragment extends Fragment {

    private OvningarViewModel mViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mViewModel =
                new ViewModelProvider(this).get(OvningarViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ovningar, container, false);
        final TextView textView = root.findViewById(R.id.text_ovningar);
        mViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
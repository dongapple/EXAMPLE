package com.example.example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragStudy  extends Fragment {
    private View view;

    public static FragStudy newinstance(){

        FragStudy fragStudy = new FragStudy();
        return fragStudy;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.frag_stduy,container,false);
        return view;
    }
}
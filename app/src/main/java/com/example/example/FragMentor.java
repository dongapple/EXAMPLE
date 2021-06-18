package com.example.example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragMentor extends Fragment {
    private View view;

    public static FragMentor newinstance(){

        FragMentor fragMentor = new FragMentor();
        return fragMentor;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.frag_mentor,container,false);
        return view;
    }
}
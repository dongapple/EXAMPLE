package com.example.example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragMeeting extends Fragment {
    private View view;

    public static FragMeeting newinstance(){

        FragMeeting fragMeeting = new FragMeeting();
        return fragMeeting;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.frag_meeting,container,false);
        return view;
    }
}
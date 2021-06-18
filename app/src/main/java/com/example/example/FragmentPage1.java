package com.example.example;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentPage1 extends Fragment {

    public static FragmentPage1 newInstance() {
        return new FragmentPage1();
    }

    private Button btn_move_mentor,btn_move_study,btn_move_contest,btn_move_meeting;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page_1, container, false);
        btn_move_mentor = rootView.findViewById(R.id.btn_move_mentor);
        btn_move_study = rootView.findViewById(R.id.btn_move_study);
        btn_move_contest = rootView.findViewById(R.id.btn_move_contest);
        btn_move_meeting = rootView.findViewById(R.id.btn_move_meeting);

        btn_move_mentor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Mentor.class);
                startActivity(intent);
            }

        });
        btn_move_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Mentor.class);
                startActivity(intent);
            }

        });
        return rootView;

        }




    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }


}
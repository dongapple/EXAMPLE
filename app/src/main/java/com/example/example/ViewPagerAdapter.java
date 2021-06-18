package com.example.example;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FragMentor.newinstance();
            case 1:
                return FragStudy.newinstance();
            case 2:
                return FragContest.newinstance();
            case 3:
                return FragMeeting.newinstance();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    //상단의 탭 레이아웃 인디케이터터
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Mentor";
            case 1:
                return "Study";
            case 2:
                return "Contest";
            case 3:
                return "Meeting";
            default:
                return null;
        }
    }
}


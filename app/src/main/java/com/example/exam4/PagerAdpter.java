package com.example.exam4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PagerAdpter#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PagerAdpter extends FragmentPagerAdapter {

    int tabcount;


    public PagerAdpter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new tabmsg();
            case 1:
                return  new tabststues();
            case 2:
                return new tabcall();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
package com.xposed.news.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ju.xposed.com.jumodle.R;

/**
 * Created by Jackie on 2015/12/29.
 * 头条
 */
public class NBAFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_nba, container, false);
        return view;
    }
}

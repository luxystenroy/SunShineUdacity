package com.kepbill.sunshine.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kepbill.sunshine.R;

/**
 * Created by luisgonzalezmac on 09-07-16.
 */
public class forecast extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.list_forecast, container, false);
    }
}

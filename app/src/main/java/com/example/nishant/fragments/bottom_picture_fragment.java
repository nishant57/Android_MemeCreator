package com.example.nishant.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by Nishant on 26/01/2016.
 */
public class bottom_picture_fragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = Inflater.inflate(R.layout.bottom_picture_fragment,container,false);
        return view;
    }
}
}

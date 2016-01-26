package com.example.nishant.fragments;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nishant on 26/01/2016.
 */
public class bottom_picture_fragment extends Fragment {

    private static TextView topMemeText;
    private static TextView bottomMemeText;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topMemeText = (TextView) view.findViewById(R.id.textView_top);
        bottomMemeText = (TextView) view.findViewById(R.id.textView_bottom);
        return view;
    }

    public void setMemeText(String top, String bottom){
        topMemeText.setText(top);
        bottomMemeText.setText(bottom);
    }

}


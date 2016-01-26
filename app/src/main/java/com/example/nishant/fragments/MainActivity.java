package com.example.nishant.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopSectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This gets called by the top fragment when the user clicks button.
    @Override
    public void createMeme(String top, String bottom) {
      bottom_picture_fragment bottomFragment = (bottom_picture_fragment) getSupportFragmentManager().findFragmentById(R.id.fragment2);
      bottomFragment.setMemeText(top, bottom);
    }
}

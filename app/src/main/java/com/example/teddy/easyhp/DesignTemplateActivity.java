package com.example.teddy.easyhp;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sid on 10/1/2016.
 */

public class DesignTemplateActivity extends Fragment {

    private  View myView;
    private LayoutInflater layoutInflater;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        myView = inflater.inflate(R.layout.design_template, container, false);
        layoutInflater = (LayoutInflater)(getActivity().getBaseContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE));
        return myView;
    }
}

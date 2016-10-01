package com.example.teddy.easyhp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Teddy on 10/1/2016.
 */

public class FurniturePicker extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Spinner dropdown = (Spinner)findViewById(R.id.furniturePicker);
        String[] items = new String[]{"1", "2", "three"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        setContentView(R.layout.design_screen);
    }
}

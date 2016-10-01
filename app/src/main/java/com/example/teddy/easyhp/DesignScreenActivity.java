package com.example.teddy.easyhp;

import android.app.Activity;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class DesignScreenActivity extends Activity {

    private ImageView image;
    private String[] furnitureOptions;
    private Spinner spinner;
    private TypedArray imgs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        furnitureOptions = getResources().getStringArray(R.array.furniture_list);
        imgs = getResources().obtainTypedArray(R.array.furniture_picture_list);

        image = (ImageView)(findViewById(R.id.furniture_images));
        spinner = (Spinner)(findViewById(R.id.furniture_spinner));

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, furnitureOptions);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner
                .setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                image.setImageResource(imgs.getResourceId(
                        spinner.getSelectedItemPosition(), -1));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.design_screen);
    }
   }

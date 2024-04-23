package com.example.myapplication31;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plantdesign);

        String description =getIntent().getStringExtra("DESCRIPTION");
        int image = getIntent().getIntExtra("IMAGE",0);

        TextView descriptionTextView =findViewById(R.id.description);
        ImageView imageview = findViewById(R.id.imageview);

        descriptionTextView.setText(description);
        imageview.setImageResource(image);

    }


}

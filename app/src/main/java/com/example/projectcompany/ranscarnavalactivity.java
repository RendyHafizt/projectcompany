package com.example.projectcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class ranscarnavalactivity extends AppCompatActivity {
    TextView carnaval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranscarnavalactivity);

        carnaval = findViewById(R.id.zoo);
        carnaval.setText(tampilFile("ranscarnaval"));
    }
    public String tampilFile(String fileName){
        String text = "";
        try {
            InputStream is = getResources().openRawResource(getResources().getIdentifier(fileName,"raw",getPackageName()));
            int size = is.available();
            byte [] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return text;
    }
}
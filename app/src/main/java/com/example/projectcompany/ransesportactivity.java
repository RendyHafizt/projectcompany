package com.example.projectcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class ransesportactivity extends AppCompatActivity {
    TextView esport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ransesportactivity);

        esport = findViewById(R.id.ransesportt);
        esport.setText(tampilFile("ransesport"));
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
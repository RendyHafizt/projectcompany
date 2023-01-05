package com.example.projectcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class alamatactivity extends AppCompatActivity {
    TextView talmt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamatactivity);

        talmt = findViewById(R.id.talamat);
        talmt.setText(tampilFile("profil"));
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
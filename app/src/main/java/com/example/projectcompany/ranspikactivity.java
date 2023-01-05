package com.example.projectcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class ranspikactivity extends AppCompatActivity {
    TextView pik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranspikactivity);

        pik = findViewById(R.id.ranspik);
        pik.setText(tampilFile("rankpik"));
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
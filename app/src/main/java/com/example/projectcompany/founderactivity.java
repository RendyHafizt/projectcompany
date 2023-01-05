package com.example.projectcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class founderactivity extends AppCompatActivity {
    String [] judulfounder;
    String [] isifounder;
    TypedArray gambarfounder;
    ImageButton bNext,bPrev;
    ImageSwitcher logoSwitcher;
    TextSwitcher judulSwitcher,isiSwitcher;
    int posisi = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_founderactivity);

        bNext = findViewById(R.id.bnext);
        bPrev = findViewById(R.id.bprev);
        logoSwitcher = findViewById(R.id.imgfounder);
        judulSwitcher = findViewById(R.id.tfounder);
        isiSwitcher = findViewById(R.id.tisifounder);
        judulfounder = getResources().getStringArray(R.array.array_founder_judul);
        isifounder = getResources().getStringArray(R.array.array_founder_isi);
        gambarfounder = getResources().obtainTypedArray(R.array.array_founder_logo);
        judulSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView judultext = new TextView(getApplicationContext());
                return judultext;
            }
        });
        isiSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView isitext = new TextView(getApplicationContext());
                return isitext;
            }
        });
        logoSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView logoimage = new ImageView(getApplicationContext());
                logoimage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return logoimage;
            }
        });
        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posisi<judulfounder.length-1){
                    posisi = posisi+1;
                    judulSwitcher.setText(judulfounder[posisi]);
                    isiSwitcher.setText(isifounder[posisi]);
                    logoSwitcher.setImageResource(gambarfounder.getResourceId(posisi,-1));
                }
            }
        });
        bPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (posisi>0){
                    posisi = posisi-1;
                    judulSwitcher.setText(judulfounder[posisi]);
                    isiSwitcher.setText(isifounder[posisi]);
                    logoSwitcher.setImageResource(gambarfounder.getResourceId(posisi,-1));
                }
            }
        });
        judulSwitcher.setText(judulfounder[posisi]);
        isiSwitcher.setText(isifounder[posisi]);
        logoSwitcher.setImageResource(gambarfounder.getResourceId(posisi,-1));
    }
}
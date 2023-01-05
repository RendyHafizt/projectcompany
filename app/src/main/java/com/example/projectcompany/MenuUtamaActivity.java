package com.example.projectcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class MenuUtamaActivity extends AppCompatActivity {
    String [] judul;
    String [] ket;
    TypedArray gambar;
    String user;
    ImageButton prof,seja,almt,ceo,vm;
    TextView tuser;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        prof = findViewById(R.id.btnprofil);
        seja = findViewById(R.id.btnsejarah);
        almt = findViewById(R.id.btnalamat);
        ceo = findViewById(R.id.btnfounder);
        vm = findViewById(R.id.btnvm);

        lv = findViewById(R.id.lvData);
        tuser = findViewById(R.id.eUserr);
        user = getIntent().getExtras().getString("user");
        tuser.setText("Selamat Datang,"+user);
        judul = getResources().getStringArray(R.array.array_judul);
        ket = getResources().getStringArray(R.array.array_ket);
        gambar = getResources().obtainTypedArray(R.array.array_logo);
        lvAdapter adapter = new lvAdapter(this,judul,ket,gambar);
        lv.setAdapter(adapter);

        prof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(MenuUtamaActivity.this,profilactivity.class);
                startActivity(p);
            }
        });
        seja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(MenuUtamaActivity.this,sejarahactivity.class);
                startActivity(s);
            }
        });
        almt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(MenuUtamaActivity.this,alamatactivity.class);
                startActivity(d);
            }
        });
        ceo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MenuUtamaActivity.this,founderactivity.class);
                startActivity(c);
            }
        });
        vm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vm = new Intent(MenuUtamaActivity.this,vmactivity.class);
                startActivity(vm);
            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent j = new Intent(MenuUtamaActivity.this,entertaimentactivity.class);
                    startActivity(j);
                }else if (i == 1){
                    Intent j = new Intent(MenuUtamaActivity.this,ransmusicactivity.class);
                    startActivity(j);
                }else if (i == 2){
                    Intent j = new Intent(MenuUtamaActivity.this,powerransactivity.class);
                    startActivity(j);
                }else if (i == 3){
                    Intent j = new Intent(MenuUtamaActivity.this,ransanimationactivity.class);
                    startActivity(j);
                }else if (i == 4){
                    Intent j = new Intent(MenuUtamaActivity.this,ransesportactivity.class);
                    startActivity(j);
                }else if (i == 5){
                    Intent j = new Intent(MenuUtamaActivity.this,mylkbyrafatharactivity.class);
                    startActivity(j);
                }else if (i == 6){
                    Intent j = new Intent(MenuUtamaActivity.this,mamagigiactivity.class);
                    startActivity(j);
                }
                else if (i == 7){
                    Intent j = new Intent(MenuUtamaActivity.this,ranscarnavalactivity.class);
                    startActivity(j);
                }else if (i == 8){
                    Intent j = new Intent(MenuUtamaActivity.this,ransnusantaraactivity.class);
                    startActivity(j);
                }else if (i == 9){
                    Intent j = new Intent(MenuUtamaActivity.this,ranspikactivity.class);
                    startActivity(j);
                }

            }
        });
    }
}
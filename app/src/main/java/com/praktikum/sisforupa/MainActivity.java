package com.praktikum.sisforupa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTelpon = findViewById(R.id.btnTelpon);
        Button btnMaps = findViewById(R.id.btnMaps);

        btnTelpon.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                telponNomor(v);
            }

            public void telponNomor(View v) {
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bukaMaps(v);
            }

            public void bukaMaps(View v) {
            }
        });
    }


    public void simulasi(View view) {
        Intent intent = new Intent(this, simulasi.class);
        startActivity(intent);
    }

    public void cuaca(View view) {
        Intent intent = new Intent(this, cuaca.class);
        startActivity(intent);
    }
    public void nilai(View view) {
        Intent intent = new Intent(this, nilai.class);
        startActivity(intent);
    }
    public void profil(View view) {
        Intent intent = new Intent(this, profil.class);
        startActivity(intent);
    }
    public void konsultasi(View view) {
        Intent intent = new Intent(this, blueprint.class);
        startActivity(intent);
    }
    public void blueprint(View view) {
        Intent intent = new Intent(this, konsultasi.class);
        startActivity(intent);
    }
    public void saran(View view) {
        Intent intent = new Intent(this, saran.class);
        startActivity(intent);
    }
    public void tentang(View view) {
        Intent intent = new Intent(this, tentang.class);
        startActivity(intent);
    }
}

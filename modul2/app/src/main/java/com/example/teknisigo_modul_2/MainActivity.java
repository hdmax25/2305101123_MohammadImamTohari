package com.example.teknisigo_modul_2;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(this, "Foto bukti " + (position + 1) + " dipilih",
                        Toast.LENGTH_SHORT).show());
    }
}
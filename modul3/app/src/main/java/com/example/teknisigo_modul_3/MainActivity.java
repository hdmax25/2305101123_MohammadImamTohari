package com.example.teknisigo_modul_3;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        TextView tvJumlah = findViewById(R.id.tvJumlah);

        ImageAdapter adapter = new ImageAdapter(this);
        gridView.setAdapter(adapter);
        tvJumlah.setText(adapter.getCount() + " Foto");

        gridView.setOnItemClickListener((parent, view, position, id) ->
                Toast.makeText(this,
                        "Bukti instalasi " + (position + 1),
                        Toast.LENGTH_SHORT).show());
    }
}
package com.example.androidac1pt2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button buttonZoo = findViewById(R.id.buttonZoo);
        buttonZoo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ZooDetailActivity.class);
            startActivity(intent);
        });

        Button buttonIguatemi = findViewById(R.id.buttonIguatemi);
        buttonIguatemi.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, IguatemiActivity.class);
            startActivity(intent);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
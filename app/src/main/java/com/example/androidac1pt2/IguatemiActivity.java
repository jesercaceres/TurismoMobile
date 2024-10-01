package com.example.androidac1pt2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class IguatemiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iguatemiactivity);

        Button buttonVerMapa = findViewById(R.id.buttonVerMapaIguatemi);
        buttonVerMapa.setOnClickListener(view -> {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Iguatemi+Esplanada");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });

        Button buttonOpenWebsite = findViewById(R.id.buttonOpenWebsiteIguatemi);
        buttonOpenWebsite.setOnClickListener(view -> {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://iguatemi.com.br/esplanada/"));
            startActivity(webIntent);
        });

        Button buttonPhoneCall = findViewById(R.id.buttonPhoneCallIguatemi);
        buttonPhoneCall.setOnClickListener(view -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:987654321"));
            startActivity(callIntent);
        });
    }
}
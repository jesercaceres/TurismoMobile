package com.example.androidac1pt2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ZooDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoodetailactivity);

        Button buttonVerMapa = findViewById(R.id.buttonVerMapa);
        buttonVerMapa.setOnClickListener(view -> {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=Zoológico de Sorocaba");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });

        Button buttonOpenWebsite = findViewById(R.id.buttonOpenWebsite);
        buttonOpenWebsite.setOnClickListener(view -> {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.zoo.sorocaba.sp.gov.br"));
            startActivity(webIntent);
        });

        Button buttonPhoneCall = findViewById(R.id.buttonPhoneCall);
        buttonPhoneCall.setOnClickListener(view -> {
            Intent callIntent = new Intent(Intent.ACTION_DIAL);
            callIntent.setData(Uri.parse("tel:123456789"));
            startActivity(callIntent);
        });
    }
}
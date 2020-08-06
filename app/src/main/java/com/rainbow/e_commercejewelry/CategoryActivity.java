package com.rainbow.e_commercejewelry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        TextView home = findViewById(R.id.Home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainScreenActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView cart = findViewById(R.id.Cart);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CartActivity.class);
                startActivity(intent);
            }
        });

        View.OnClickListener earringsListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EarringsActivity.class);
                intent.putExtra("title", "EARRINGS");
                startActivity(intent);
            }
        };

        View.OnClickListener necklasesListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EarringsActivity.class);
                intent.putExtra("title", "NECKLACES");
                startActivity(intent);
            }
        };

        View.OnClickListener ringsListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), EarringsActivity.class);
                intent.putExtra("title", "RINGS");
                startActivity(intent);
            }
        };
        TextView earringsLbl = findViewById(R.id.EarringsLbl);
        ImageView earringsImg = findViewById(R.id.EarringsImg);
        earringsLbl.setOnClickListener(earringsListener);
        earringsImg.setOnClickListener(earringsListener);

        TextView necklasesLbl = findViewById(R.id.necklacesLbl);
        ImageView necklasesImg = findViewById(R.id.necklacesImg);
        necklasesLbl.setOnClickListener(necklasesListener);
        necklasesImg.setOnClickListener(necklasesListener);

        TextView ringsLbl = findViewById(R.id.ringsLbl);
        ImageView ringsImg = findViewById(R.id.ringsImg);
        ringsLbl.setOnClickListener(ringsListener);
        ringsImg.setOnClickListener(ringsListener);
    }
}
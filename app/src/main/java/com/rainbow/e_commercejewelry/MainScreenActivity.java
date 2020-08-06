package com.rainbow.e_commercejewelry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        // TODO The colors of the text "Welcome to Jewerly"
        Button startBtn = findViewById(R.id.StartBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Go to the categories screen
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
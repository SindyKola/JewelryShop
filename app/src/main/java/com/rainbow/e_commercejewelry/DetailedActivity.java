package com.rainbow.e_commercejewelry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailedActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        Intent intent = getIntent();
        ImageView image = findViewById(R.id.image);
        TextView name = findViewById(R.id.name);
        TextView desc = findViewById(R.id.desc);
        TextView price = findViewById(R.id.price);
        image.setImageDrawable(ContextCompat.getDrawable(this, intent.getIntExtra("image", R.drawable.e1)));
        name.setText(intent.getStringExtra("name"));
        desc.setText(intent.getStringExtra("desc"));
        price.setText("$" + intent.getIntExtra("price", 0) + ".00");

        TextView add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cart.instance().getList().add(Pass.product);
                Toast.makeText(DetailedActivity.this, "Added to cart!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Pass.product = null;
    }
}
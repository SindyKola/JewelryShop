package com.rainbow.e_commercejewelry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class EarringsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earrings);

        ImageView search = findViewById(R.id.Search);
        TextView home = findViewById(R.id.Home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainScreenActivity.class);
                startActivity(intent);
                finish();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
        Intent intent = getIntent();
        if (intent.getStringExtra("title").equals("EARRINGS")) {
            RecyclerView recyclerView = findViewById(R.id.review);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
            ProductsAdapter adapter = new ProductsAdapter(Earrings.instance().getList());
            recyclerView.setAdapter(adapter);
        } else {
            TextView title = findViewById(R.id.title);
            title.setText(intent.getStringExtra("title"));
            RecyclerView recyclerView = findViewById(R.id.review);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
            if (intent.getStringExtra("title").equals("NECKLACES")) {
                ProductsAdapter adapter = new ProductsAdapter(Necklaces.instance().getList());
                recyclerView.setAdapter(adapter);
            } else {
                ProductsAdapter adapter = new ProductsAdapter(Rings.instance().getList());
                recyclerView.setAdapter(adapter);
            }
        }

    }
}
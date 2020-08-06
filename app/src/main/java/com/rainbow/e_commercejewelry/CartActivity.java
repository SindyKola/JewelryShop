package com.rainbow.e_commercejewelry;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CartActivity extends AppCompatActivity {

    public static TextView total = null;

    @SuppressLint("SetTextI18n")
    public static void calc() {
        int sum = 0;

        for (Product x : Cart.instance().getList()) {
            sum += x.getPrice();
        }

        total.setText("$" + sum + ".00");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        RecyclerView recyclerView = findViewById(R.id.review);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CartAdapter adapter = new CartAdapter(Cart.instance().getList());
        recyclerView.setAdapter(adapter);

        total = findViewById(R.id.total);

        calc();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        total = null;
    }
}
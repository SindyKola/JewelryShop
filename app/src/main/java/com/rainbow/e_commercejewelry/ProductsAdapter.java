package com.rainbow.e_commercejewelry;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ViewHolder> {

    private LinkedList<Product> list;

    public ProductsAdapter(LinkedList<Product> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_cell_layout, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Product product = list.get(position);
        ImageView imageView = holder.view.findViewById(R.id.image);
        imageView.setImageDrawable(ContextCompat.getDrawable(holder.view.getContext(), product.getImage()));
        imageView.setOnClickListener(null);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailedActivity.class);
                Pass.product = list.get(position);
                intent.putExtra("name", product.getName());
                intent.putExtra("desc", product.getDescription());
                intent.putExtra("price", product.getPrice());
                intent.putExtra("image", product.getImage());
                v.getContext().startActivity(intent);
            }
        });
        ((TextView) holder.view.findViewById(R.id.name)).setText(product.getName());
        ((TextView) holder.view.findViewById(R.id.price)).setText("$" + product.getPrice() + ".00");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
        }
    }
}

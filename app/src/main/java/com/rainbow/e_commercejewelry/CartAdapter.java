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

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.ViewHolder>{

    private LinkedList<Product> list;

    public CartAdapter(LinkedList<Product> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CartAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_cell_layout, parent, false);
        return new CartAdapter.ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final CartAdapter.ViewHolder holder, final int position) {
        final Product product = list.get(position);
        ImageView imageView = holder.view.findViewById(R.id.image);
        imageView.setImageDrawable(ContextCompat.getDrawable(holder.view.getContext(), product.getImage()));
        ((TextView) holder.view.findViewById(R.id.name)).setText(product.getName());
        ((TextView) holder.view.findViewById(R.id.name2)).setText(product.getName());
        ((TextView) holder.view.findViewById(R.id.price)).setText("$" + product.getPrice() + ".00");
        TextView remove = holder.view.findViewById(R.id.remove);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(position);
                CartAdapter.this.notifyDataSetChanged();
                CartActivity.calc();
            }
        });
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

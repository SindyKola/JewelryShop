package com.rainbow.e_commercejewelry;

import java.util.LinkedList;

public class Cart {

    private static Cart instance = null;

    private LinkedList<Product> cart = new LinkedList<>();

    public static Cart instance() {
        if (instance == null) {
            instance = new Cart();
        }
        return instance;
    }

    public LinkedList<Product> getList() {
        return cart;
    }
}

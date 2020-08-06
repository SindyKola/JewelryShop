package com.rainbow.e_commercejewelry;

import java.util.LinkedList;

public class Necklaces {

    private static Necklaces instance = null;

    private LinkedList<Product> necklaces = new LinkedList<>();

    public static Necklaces instance() {
        if (instance == null) {
            instance = new Necklaces();
        }
        return instance;
    }

    public LinkedList<Product> getList() {
        return necklaces;
    }

    private Necklaces() {
        necklaces.add(new Product("Gilded Ring", 312, "ring on your finger? passe", R.drawable.n1));
        necklaces.add(new Product("Arsinoe Medal", 364, "not sure what it is awarded for but it will for sure make you special", R.drawable.n2));
        necklaces.add(new Product("Chain Necklace", 288, "a classic. no further explanation needed.", R.drawable.n3));
        necklaces.add(new Product("Arc Necklace", 326, "It's not noah's but it will still save humanity", R.drawable.n4));
        necklaces.add(new Product("Vintage Keys", 188, "a legend says one of these leads straight to one's heart - which one do you pick?", R.drawable.n5));
        necklaces.add(new Product("Medallion", 212, "made with care to always make you feel safe", R.drawable.n6));
        necklaces.add(new Product("Orb Pendant", 234, "a subtle yet elegant necklace will be perfect for any look", R.drawable.n7));
        necklaces.add(new Product("Solar Disks", 289, "Like the sun is a main point of the solar system - so you will be the main point of the party while you wear these earrings", R.drawable.n8));
        necklaces.add(new Product("Pearl Doublets", 279, "Everyone has a pearl to uncover inside of them - these earrings will help you unleash your inner pearl", R.drawable.n9));
        necklaces.add(new Product("Hermes Earrings", 209, "They will always guide you in the right direction", R.drawable.n10));
        necklaces.add(new Product("Diamond", 169, "These diamond earrings will make you feel like the star you are", R.drawable.n11));
        necklaces.add(new Product("Vintage Doublets", 199, "Inspired by the snail, these earrings will not leave you behind", R.drawable.n12));
        necklaces.add(new Product("Floral Fantasy", 229, "Best Paired With Champagne And A Pearl Dress", R.drawable.n13));
        necklaces.add(new Product("Hana Hoops", 219, "Inspired by the mum", R.drawable.n14));
        necklaces.add(new Product("Twist Hoops", 149, "Beautiful earrings made to make you feel special", R.drawable.n15));
        necklaces.add(new Product("Bold Hoops", 269, "These incredible earrings are Audrey’s personal favourites from collection 15.", R.drawable.n16));
    }
}

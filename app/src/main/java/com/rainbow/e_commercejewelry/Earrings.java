package com.rainbow.e_commercejewelry;

import java.util.LinkedList;

public class Earrings {

    private static Earrings instance = null;

    private LinkedList<Product> earrings = new LinkedList<>();

    public static Earrings instance() {
        if (instance == null) {
            instance = new Earrings();
        }
        return instance;
    }

    public LinkedList<Product> getList() {
        return earrings;
    }

    private Earrings() {
        earrings.add(new Product("Deco Hoops", 234, "It only takes one piece to make you feel bold, luxe and confident. handcrafted and made of 24-karat yellow gold, This spiral cuff will lock the sun right by your cheeks.", R.drawable.e1));
        earrings.add(new Product("Orb Ear Cuff", 64, "Subtle ear cuff made for any and every occasion", R.drawable.e2));
        earrings.add(new Product("Soho Hoops", 128, "paired with the soho ear cuff, the hoops will make you feel like you own the world", R.drawable.e3));
        earrings.add(new Product("Soho Ear Cuff", 56, "My soho ear cuff could mean anything", R.drawable.e4));
        earrings.add(new Product("Orb Earring", 188, "Orb is what you make it - so make it count", R.drawable.e5));
        earrings.add(new Product("Stacked Hoops", 212, "Hoops are perfect for any occasion as Jennie from the block said - so why not wear multiple of them?", R.drawable.e6));
        earrings.add(new Product("Ame Earring", 198, "This part of little earrings will be perfect for any occasion", R.drawable.e7));
        earrings.add(new Product("Solar Disks", 289, "Like the sun is a main point of the solar system - so you will be the main point of the party while you wear these earrings", R.drawable.e8));
        earrings.add(new Product("Pearl Doublets", 279, "Everyone has a pearl to uncover inside of them - these earrings will help you unleash your inner pearl", R.drawable.e9));
        earrings.add(new Product("Hermes Earrings", 209, "They will always guide you in the right direction", R.drawable.e10));
        earrings.add(new Product("Diamond", 169, "These diamond earrings will make you feel like the star you are", R.drawable.e11));
        earrings.add(new Product("Vintage Doublets", 199, "Inspired by the snail, these earrings will not leave you behind", R.drawable.e12));
        earrings.add(new Product("Floral Fantasy", 229, "Best Paired With Champagne And A Pearl Dress", R.drawable.e13));
        earrings.add(new Product("Hana Hoops", 219, "Inspired by the mum", R.drawable.e14));
        earrings.add(new Product("Twist Hoops", 149, "Beautiful earrings made to make you feel special", R.drawable.e15));
        earrings.add(new Product("Bold Hoops", 269, "These incredible earrings are Audrey’s personal favourites from collection 15.", R.drawable.e16));
    }
}

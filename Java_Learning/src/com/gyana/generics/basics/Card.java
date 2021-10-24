package com.gyana.generics.basics;

import java.util.HashMap;
import java.util.Map;

/**
 * A class that takes two generic bounded parameters
 *
 * @param <K>
 * @param <V>
 */
public class Card<K extends Number, V extends CharSequence> {

    private K k;
    private V v;

    private Map<K, V> map = new HashMap<>();

    public Card(K k, V v) {
        this.k = k;
        this.v = v;
        map.put(k, v);
    }

    public void displayTypes() {
        System.out.println(k.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(this.map.get(k));
    }

    public static void main(String[] args) {
        new Card<Integer, String>(5, "1").displayTypes();
        new Card<Number, StringBuilder>(1, new StringBuilder("I am a builder")).displayTypes();
    }
}

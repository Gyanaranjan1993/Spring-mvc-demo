package com.gyana.generics.basics;

/**
 * Below class is a parameterized class
 * @param <K>
 * @param <V>
 */
public class Laptop <K, V>{

    private K k;
    private V v;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}

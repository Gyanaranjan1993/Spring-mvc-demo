package com.gyana.generics.basics;

/**
 * Generic constructors, In below example you can see how we can create different type of
 * generic constructors which can take different generic types. we need to have K on class
 * declaration though as it does not work without that.
 *
 * @param <K>
 */
public class Tennis<K> {

    public <T> Tennis(T t) {
    }

    public <K extends CharSequence> Tennis(K k) {
    }

    public <T extends Number> Tennis(T t) {

    }

    public static void main(String[] args) {
        Tennis tennis_1 = new Tennis<String>("Lawn Tennis");

        Tennis tennis_2 = new Tennis<Integer>(10);

        Tennis tennis_3 = new Tennis<Boolean>(true);
    }
}

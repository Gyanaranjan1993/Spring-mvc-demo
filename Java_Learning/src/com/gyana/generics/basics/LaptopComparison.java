package com.gyana.generics.basics;

/**
 * Defines a generic method that takes two generic objects
 *
 */
public class LaptopComparison {

    public static <K, V> boolean compare(Laptop<K, V> laptop_1, Laptop<K, V> laptop_2) {

        return laptop_1.getK().equals(laptop_2.getK())
                && laptop_1.getV().equals(laptop_2.getV());
    }

    public static void main(String[] args) {

        Laptop<String, Integer> laptop_1 = new Laptop<>();
        laptop_1.setK("Dell");
        laptop_1.setV(4);

        Laptop<String, Integer> laptop_2 = new Laptop<>();
        laptop_2.setK("Lenovo");
        laptop_2.setV(4);

        Laptop<Integer, Integer> laptop_3 = new Laptop<>();
        laptop_3.setK(10);
        laptop_3.setV(4);

        System.out.println(LaptopComparison.compare(laptop_1, laptop_2));

        //the below <String, Integer> is not required as compiler will do type inference
        System.out.println(LaptopComparison.<String, Integer>compare(laptop_1, laptop_2));

        //the below does not work as we pass two different types of Laptop objects
        //System.out.println(LaptopComparison.compare(laptop_1,laptop_3));

    }
}

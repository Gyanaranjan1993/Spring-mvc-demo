package com.gyana.generics.basics;

import java.util.ArrayList;
import java.util.List;

/**
 * Producer Extends , Consumer Super
 * https://stackoverflow.com/questions/2723397/what-is-pecs-producer-extends-consumer-super
 */
public class PECS {

    // here you are writing to the list/collection. i.e you are consuming to the collection.
    // as you have done ? extends Number, how the hell the compiler would know what type of
    // collection its gonna be. It can be a List<Integer> or List<Number> or a List<Double>
    // therefore this is not allowed in java generics.

//    static void consume(List<? extends Number> list) {
//        list.add(5);
//        list.add(10);
//        list.add(10.99);
//    }

    //in this case where we produce data out of the collection. i.e reading from it.
    //we dont guarrantee a particular type of return as the list can be a Number , an Object etc.

//    static Integer produce(){
//
//        List<? super Integer> integerFoo = new ArrayList<>();
//
//        integerFoo.add(10);
//        integerFoo.add(new Object());
//
//        return integerFoo.get(0);
//    }

    //Look at this example. we declare producers as extends and consumer as super.
    //in that way for producer compiler always know its a number all the time and it can do operation
    // as long as its a number. so it does not complain.

    // for consumer if we declare super compiler knows that it can add data to it as long as its Number or its super type.
    //e.g. if you do super Number , it can add anything that is a number or its super type.

    //But , think when you do consumer as <? extends Number>, compiler does not know whether its a Integer collection
    //or double collection until run time. and now if you try to add a double to the collection, compiler has no clue
    // during compile time of what type of collection you are creating.


    static List<? super Integer> produce(List<? extends Number> numberFoo, List<? extends Number> doubleFoo) {
        List<? super Number> consumeFoo = new ArrayList<Object>();
        List<? super Number> consumeFoo2 = new ArrayList<Number>();

        //see this
        //List<? extends Number> consumerFoo3 = new ArrayList<Integer>();

        int x = (int) Math.random();

        if (x < 10) {
            consumeFoo.add(numberFoo.get(0));
        } else
            consumeFoo.add(doubleFoo.get(0));

        //consumerFoo3.add(doubleFoo.get(0));
        return consumeFoo;
    }

    public static void main(String[] args) {
        List<Integer> integerFoo = new ArrayList<>();
        List<Double> doubleFoo = new ArrayList<>();

        integerFoo.add(10);
        doubleFoo.add(10.5);

        System.out.println(produce(integerFoo, doubleFoo).get(0));


    }


}

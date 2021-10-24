package com.gyana.generics.basics;

/**
 * Shows raw generic type and bounded type
 * @param <T>
 */
public class Box<T> {

    private T t;

    public Box(T t) {
        this.t = t;
    }

     //static method taking generics
     public static <U extends Number> U inspect(U u){
         System.out.println("U :"+ u.getClass().getName());
         return u;
    }

    public void getT(){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
         //Box.inspect("Can not take a String as it expects a number");
        Box.inspect(5);
        Box.inspect(10.5);

        //raw type
        new Box(5).getT();

        //error out as passing as creating a String type object but passing an integer
        //new Box<String>(5).getT();

        //works fine as I create a String type and pass String too
        new Box<String>("Its correct").getT();

    }
}

package com.gyana.generics.basics;

/**
 * Demonstrates multiple bounded types - T extends Player & Music & Song
 *
 * @param <T>
 */
public class Hyundai<T extends Player & Music & Song> {

    private T t;

    public Hyundai(T t){
        this.t = t;
    }

    void displayPlayerType(){
        System.out.println("player type is :" + t.getClass().getName());
    }

    public static void main(String[] args) {

        VLC_Player v = new VLC_Player();

        //VLC_Player extends all of Player & Music & Song
        new Hyundai<VLC_Player>(v).displayPlayerType();

        //raw type
        new Hyundai(v).displayPlayerType();

        RockMusic rm = new RockMusic();

        //below does not work as rm only implements music and not others
        //new Hyundai(rm).displayPlayerType();

    }
}

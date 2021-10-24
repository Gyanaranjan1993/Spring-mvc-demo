package com.gyana.generics.basics;

public class VLC_Player extends Player {

    @Override
    public void play(String song) {
        System.out.println("Playing in VLC");
    }

    @Override
    public void lyrics(String lyrics) {
        System.out.println("Writing to lyrics in VLC");
    }
}

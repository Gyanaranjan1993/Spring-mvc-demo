package com.gyana.design.abstractfactory;

public class NissanMusic implements MusicSystem {

    @Override
    public void playMusic(String musicName) {
        System.out.println("Playing in Nissan");
    }
}

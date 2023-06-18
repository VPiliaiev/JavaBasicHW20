package com.gmail.valeriipiliaiev;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] styles = {new PopMusic(), new RockMusic(), new ClassicMusic()};
        for (MusicStyles style : styles) {
            style.playMusic();
        }
        System.out.println("All music styles have been played.");
    }
}

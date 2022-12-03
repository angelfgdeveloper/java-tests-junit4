package org.example.player;

import java.util.Random;

public class Dice {

    private  int sides; // lados

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        // número de dado aleatorio
        return new Random().nextInt(this.sides) + 1;
    }

}

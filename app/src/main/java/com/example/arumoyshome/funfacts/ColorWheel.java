package com.example.arumoyshome.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by arumoyshome on 2015-06-06.
 */
public class ColorWheel {
    public String[] mcolors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    public int getColor(){
        String color;

        // randomly select a fact
        Random randomGenerator = new Random(); //construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mcolors.length);
        color = mcolors[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    };
}


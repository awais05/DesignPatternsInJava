package com.designpattern.finaldesign.behaviours.quack;

/**
 * The mute behaviour does not make any sound.
 */
public class Mute implements QuackBehaviour {

    @Override
    public void performQuack() {
        System.out.println("I cannot make a sound.");
    }

}

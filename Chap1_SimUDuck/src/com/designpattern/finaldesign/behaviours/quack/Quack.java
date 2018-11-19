package com.designpattern.finaldesign.behaviours.quack;

/**
 * The normal quack method.
 */
public class Quack implements QuackBehaviour {

    @Override
    public void performQuack() {
        System.out.println("This is a normal quack!");
    }
}

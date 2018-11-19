package com.designpattern.finaldesign.behaviours.fly;


/**
 * Do not fly method.
 */
public class DoNotFly implements FlyBehaviour {

    @Override
    public void performFlying() {
        System.out.println("I cannot fly!");
    }
}

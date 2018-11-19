package com.designpattern.finaldesign.behaviours.fly;

/**
 * Ducks flying with wings method.
 */
public class FlyWithWings implements FlyBehaviour {

    @Override
    public void performFlying() {
        System.out.println("I am flying with wings.");
    }
}

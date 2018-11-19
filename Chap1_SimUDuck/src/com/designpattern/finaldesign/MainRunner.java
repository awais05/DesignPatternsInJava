package com.designpattern.finaldesign;

import com.designpattern.finaldesign.behaviours.fly.DoNotFly;
import com.designpattern.finaldesign.behaviours.fly.FlyWithWings;
import com.designpattern.finaldesign.ducks.Duck;
import com.designpattern.finaldesign.ducks.MallardDuck;

/**
 * The runner class.
 */
public class MainRunner {

    /**
     * Main function in runner class.
     * @param args
     */
    public static void main(String[] args){

        Duck duck = new MallardDuck();

        duck.setFlyBehaviour(new FlyWithWings());
        duck.fly();
        duck.setFlyBehaviour(new DoNotFly());
        duck.fly();

    }
}

package com.designpattern.finaldesign.ducks;

import com.designpattern.finaldesign.behaviours.fly.FlyBehaviour;
import com.designpattern.finaldesign.behaviours.quack.QuackBehaviour;

/**
 * The main Duck Class.
 * In the final design the fly and quack methods concrete implementations were taken out of the Duck class and they were implemented as behaviours.
 *
 */
public class Duck {

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;


    /**
     * Getters and setters enable us to set flying behaviours dynamically.
     * @return
     */
    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    /**
     * A simple method to perform the swim operation.
     */
    public void swim() {
        System.out.println ("Swim in Duck Class.");
    }

    /**
     * The fly method which performs flying polymorphically.
     */
    public void fly() {
        this.flyBehaviour.performFlying();
    }

    /**
     * The quack method which performs quack polymorphically.
     */
    public void quack(){
        this.quackBehaviour.performQuack();
    }
}
package com.designpattern.flymethod;

/**
 * The main Duck Class.
 */
public class Duck {

    /**
     * A simple method to perform the quack operation/
     */
    public void quack() {
        System.out.println ("Quack in Duck Class.");
    }

    /**
     * A simple method to perform the swim operation.
     */
    public void swim() {
        System.out.println ("Swim in Duck Class.");
    }

    /**
     * The fly method was added here.
     * It caused all Ducks (Even the rubber duck) to fly which is not the expected behaviour.
     */
    public void fly(){
        System.out.println("I am flying.");
    }
}
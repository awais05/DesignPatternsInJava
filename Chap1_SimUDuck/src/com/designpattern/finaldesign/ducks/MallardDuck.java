package com.designpattern.finaldesign.ducks;


import com.designpattern.finaldesign.behaviours.fly.FlyWithWings;
import com.designpattern.finaldesign.behaviours.quack.Quack;


/**
 * The Mallard Duck class.
 * It represents one of the Duck's breed.
 */
public class MallardDuck extends Duck {


    /**
     * Default constructor.
     */
    public MallardDuck(){
        this.setFlyBehaviour(new FlyWithWings());
        this.setQuackBehaviour(new Quack());
    }

    /**
     * Method to display the duck.
     */
    public void display(){
        System.out.println("I am a mallard duck");
    }



}

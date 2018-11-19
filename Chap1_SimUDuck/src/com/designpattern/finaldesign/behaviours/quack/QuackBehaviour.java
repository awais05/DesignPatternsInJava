package com.designpattern.finaldesign.behaviours.quack;

/**
 * Quack Behaviour is used to pull out the quack method from duck class. It ensures:
 * That new quack types can be added with out major code changes.
 * Code reuse.
 * Programming to an interface and not an implementation.
 * Note that we could have used an abstract class too. Interface was favoured because we were sure it will never be initialised.
 */
public interface QuackBehaviour {


    /**
     * Perform Quack is the only method that this interface needs.
     * Interface methods are by default public.
     */
    void performQuack();

}

package com.designpattern.finaldesign.behaviours.fly;


/**
 * Fly Behaviour is used to pull out the fly method from duck class.
 * It ensures:
 * That new fly types can be added with out major code changes.
 * Code reuse.
 * Programming to an interface and not an implementation.
 * Note that we could have used an abstract class too. Interface was favoured because we were sure it will never be initialised.
 */
public interface FlyBehaviour {

    /**
     * The perform flying method.
     */
    void performFlying();
}

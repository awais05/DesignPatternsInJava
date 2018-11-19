# Chapter 1: Welcome to Design Patterns


## Initial Design

* The initial design had a simple design where Duck was the parent class with quack(), swim() and display() methods.
* All classes would inherit Duck class and implement their own methods.


## Now we Need the Ducks to Fly

* **A fly method was introduced in the Duck class.**
    * This led to a design disaster. All ducks (even the rubber duck) started flying on the screen. 
        * **What was thought as a great use of inheritance for the purpose of reuse did not turn out so well when it came to maintenance**
        
* **The next thought was to override the fly method in rubber duck to stop it from flying just like quack was overridden to squeak.**
    * This again raised a concern when it came to addition of new ducks later. For example wooden decoy ducks, these are not supposed to quack or fly.
    
* **Then came the idea of using an interface flyable and quackable in all the ducks who could fly and quack**
    * This sounded good initially but consider the effort of making change in flyable interface for all 48 duck types if there is common change for all ducks. This completely destroys the code reuse for the two behaviour, creating just another maintenance nightmare because java interface does not have any implementation code.
    * This means whenever a code change is needed in these behaviours, you will have to track down their usages and make the code change along the way (introducing more bugs too).
    

## The First Design Principle

#### _Identify the aspects of your application that vary and separate them from what stays the same._
**"Take what varies and _encapsulate_ it so a change in this varying part wont effect the rest of the code."**

* To separate fly() and quack() from Duck class we'll pull both methods out and create a new set of classes to represent each behaviour.
* For example, we might want to instantiate a MallardDuck instance and initialize it with a specific type of flying behaviour. And while we are there, why not make sure that we can change the behaviour dynamically by putting the setter methods in the Duck class so that we can say, change the MallardDuck flying behaviour at runtime.




## The Second Design Principle

#### _Program to an interface, not an implementation._

### The Next Design
* An interface (This is not the typical java interface) represents each behaviour (fly and quack here).
* **Each implementation of a behaviour will implement one of those interfaces.**
* This is in contrast to the way we were doing things earlier, where a behaviour wither came from a CONCRETE implementation in the super class or by providing a specialized implementation in the subclass. In both cases we were relying on an implementation.
* **"Program to an interface" really means "Program to a supertype"** (Can be any thing for example an abstract superclass, not necessarily a java interface)
* The idea is to exploit POLYMORPHISM by programming to a supertype so that the actual runtime object isn't locked into the code.
* We could rephrase "program to a supertype" as the declared type of the variable should be supertype, usually an abstract class or interface, so that the objects assigned to those variables can be of any concrete implementation of the supertype.

```
// Programming to an implementation would be: 

Dog d = new Dog();
d.bark(); // Declaring the variable as Dog forces us to code to a concrete implementation.

// But programming to an implementation (interface/supertype)
Animal animal = new Dog();
animal.makeSound(); // We know it's a dog but we can now use the animal reference polymorphically.

// Even better assign the concrete implementation object at runtime by using getters and setters.
animal = getAnimal();
animal.makeSound(); // We don't know WHAT the actual animal subtype is. All we care about is that it knows how to respond to makeSound().

```




    

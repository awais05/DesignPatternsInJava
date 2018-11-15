# Chapter 1: Welcome to Design Patterns

## Initial Design

* The initial design had a simple design where Duck was the parent class with quack(), swim() and display() methods.
* All classes would inherit Duck class and implement their own methods.

## Now we Need the Ducks to Fly

* **A fly method was introduced in the Duck class.**
    * This led to a design disaster. All ducks (even the rubber duck) started flying on the screen. 
        * **What was thought as a great use of inheritance for the purpose of reuse did not turn out so well when it came to maintenance**
        
* **The next thought was to override the fly method in rubber duck to stop it from flying just like quack was override to squeak.**
    * This again raised a concern when it came to addition of new ducks later. For example wooden decoy ducks, these are not supposed to quack or fly.
    

# Object Oriented Design Principles and Techniques 

### This project splits in two structures. 
1. The SOLID folder has implementations of the SOLID principles of object oriented design.
1. The Patterns folder has implementations of common design patterns of object oriented software.


## SOLID
The folder is structured in packages based on the principle it implements each package.

### Open Close Principle
In this example I implemented a device remote control system. There are three devices ( TV, SurroundSoundSystem, Projector) which all implement the Device abstract class. The RemoteControl class holds the connected device and invokes their methods through polymorphism. Instead of having a switch case statement in the RemoteControl class I invoke directly their inhereted methods from Device class.


## Patterns

### Builder
The builder pattern is for constructing objects with many fields and providing a fluent api.
1. Simple builder
 In this example the Student class has too many fields so the client should be able to construct with any fields he needs. In order to avoid implemented all possible compinations of constructors we hide the constructor of the Student and we implement a builder inner class.
2. Facade builder
  In this example the Student class can be build through two different builders building different facets of the object. The StudentBuilderInfo builds the general info of the Student (firstName, lastName, age) and the StudentBuilderAddress builds the location info (city, address, postCode). Throught the StudentBuilderFacade I provide a builder fluent interface.


### Singleton
The singleton pattern is for instantiating an object of a class only once. In the example the singleton class has a counter to indicate that only one instance has been created, and a text to indicate that all the variables of this instance point to the same object and have the same data.

### Observer
The observer pattern where observers subscribe to a subject and when a specific state changes the subject class notifies them. I implemented a simple messaging system. The subject class is the MessageManagerSystem where observers can subscribe/unsubscribe. The observers are different departments (IT, Marketing). Through the MessageManagerSystem object the client publishes an announcement and all the subscribed observers are notified.

### Factory
The factory pattern is used to construct ojbects without specifying the exact class. The example has a ShapeFactory where it constructs a Circle, a Triangle, and a Square. I avoided the switch case statement on the ShapeFactory and created an Enum Class called ShapeType cause otherwise I would violate the Open Close Principle.

### Dependency Injection
Depenedency injection is used where an object supplies the dependencies of an other object instead of hardcoding them. I implemented this through a Vehicle class which has a direct assosiation to the Engine class. Engine can be either LargeEngine or SmallEngine. Instead of hardcoding the engine type in the Vehicle class I pass that as an argument to the constructor of the Vehicle class allowing the client to inject the dependency.

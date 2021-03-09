# Object Oriented Design Principles and Techniques 

This project was created during my studying of [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/Design-Patterns-Object-Oriented-Addison-Wesley-Professional-ebook/dp/B000SEIBB8). 

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
 In this example the Student class has too many fields so the client should be able to construct with any fields he needs. In order to avoid implemented all possible combinations of constructors we hide the constructor of the Student and we implement a builder inner class.
2. Facade builder
  In this example the Student class can be build through two different builders building different facets of the object. The StudentBuilderInfo builds the general info of the Student (firstName, lastName, age) and the StudentBuilderAddress builds the location info (city, address, postCode). Through the StudentBuilderFacade I provide a builder fluent interface.

### Singleton
The singleton pattern is for instantiating an object of a class only once. In the example the singleton class has a counter to indicate that only one instance has been created, and a text to indicate that all the variables of this instance point to the same object and have the same data.

### Prototype
The Prototype pattern is used to implement a way of duplicating objects in an effective way. In this example I provide deep copy interface of the student class by copying all the dependencies of this class as well such as the Address class.

### Factory
The factory pattern is used to construct objects without specifying the exact class. The example has a ShapeFactory where it constructs a Circle, a Triangle, and a Square. I avoided the switch case statement on the ShapeFactory and created an Enum Class called ShapeType cause otherwise I would violate the Open Close Principle.

### Decorator
Decorator is used in order to extend the functionality of a class without modifying the existing class (Open Close Principle). I use a Calculator Interface to define the abstract methods of a calculator. The BasicCalculator class implements this Interface and represents a Calculator with simple add and subtract methods. Now lets say we need to modify the operations of this BasicCalculator class but we are not allowed to modify the class cause we will violate the OCP. With that in mind I created and abstract decorator that will be implemented with the new functionalities that are needed.

### Facade
Its a good practice to hide the complexity of a system by providing an elegant way so the user doesn`t need to know all the details of the implementation. In this example I demonstrate a car engine which needs too much details for the user to start/end it (AirFlow,Cooling,Fuel). So I created a facade called CarEngineFacade which provides a nice interface for the user to start and end the engine without forcing the client to configure all the details.

### Dependency Injection
Dependency injection is used where an object supplies the dependencies of an other object instead of hardcoding them. I implemented this through a Vehicle class which has a direct association to the Engine class. Engine can be either LargeEngine or SmallEngine. Instead of hardcoding the engine type in the Vehicle class I pass that as an argument to the constructor of the Vehicle class allowing the client to inject the dependency.

### Observer
The observer pattern where observers subscribe to a subject and when a specific state changes the subject class notifies them. I implemented a simple messaging system. The subject class is the MessageManagerSystem where observers can subscribe/unsubscribe. The observers are different departments (IT, Marketing). Through the MessageManagerSystem object the client publishes an announcement and all the subscribed observers are notified.

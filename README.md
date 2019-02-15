# Object Oriented Design Principles and Techniques 

### This project splits in two structures. 
1. The SOLID folder has implementations of the SOLID principles of object oriented design.
1. The Patterns folder has implementations of common design patterns of object oriented software.

## SOLID
The folder is structured in packages based on the principle it implements each package.

## Patterns

### Builder
The builder pattern is for constructing objects with many fields. . In this Example the Student class has too many fields so the client should be able to construct with any fields he needs.In order to avoid implemented all possible compinations of constructors we hide the constructor of the Student and we implement a builder inner class.
It impoves usability and readability.

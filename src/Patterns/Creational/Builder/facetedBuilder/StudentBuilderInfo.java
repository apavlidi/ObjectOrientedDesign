package Patterns.Creational.Builder.facetedBuilder;

public class StudentBuilderInfo extends StudentBuilderFacade{


    public StudentBuilderInfo(Student student) {
        this.student = student;
    }

    public StudentBuilderInfo firstName(String firstName){
        student.firstName = firstName;
        return this;
    }

    public StudentBuilderInfo lastName(String lastName){
        student.lastName = lastName;
        return this;
    }

    public StudentBuilderInfo age(int age){
        student.age = age;
        return this;
    }

}

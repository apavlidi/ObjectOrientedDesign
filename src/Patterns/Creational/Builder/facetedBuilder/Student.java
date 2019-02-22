package Patterns.Creational.Builder.facetedBuilder;

public class Student {

    String firstName;
    String lastName;
    int age;

    String city;
    String address;
    String postCode;


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", postCode='" + postCode + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

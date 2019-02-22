package Patterns.Creational.Builder.simpleBuilder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Student student = new Student.Builder(1L)
                .firstName("Alexis")
                .lastName("Pavlidis")
                .semester(8)
                .address("20 Georgiou 8")
                .email("apavlidi@it.teithe.gr")
                .phoneNumber(6999999L)
                .registeredDate(LocalDate.of(1996, 10, 9)).build();

        System.out.println(student);
    }

}

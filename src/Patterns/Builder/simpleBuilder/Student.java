package Patterns.Builder.simpleBuilder;

import java.time.LocalDate;

public class Student {

    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private Long phoneNumber;

    private String email;

    private int semester;

    private LocalDate registeredDate;

    private Student(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        address = builder.address;
        phoneNumber = builder.phoneNumber;
        email = builder.email;
        semester = builder.semester;
        registeredDate = builder.registeredDate;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", semester=" + semester +
                ", registeredDate=" + registeredDate +
                '}';
    }

    public static class Builder {

        private Long id;

        private String firstName;

        private String lastName;

        private String address;

        private Long phoneNumber;

        private String email;

        private int semester;

        private LocalDate registeredDate;

        public Builder(Long id) {
            this.id = id;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(Long phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder semester(int semester) {
            this.semester = semester;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder registeredDate(LocalDate registeredDate) {
            this.registeredDate = registeredDate;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

}

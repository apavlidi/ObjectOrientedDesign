package Patterns.Creational.Builder.facetedBuilder;

public class StudentBuilderAddress extends StudentBuilderFacade {

    public StudentBuilderAddress(Student student) {
        this.student = student;
    }

    public StudentBuilderAddress in(String cityName) {
        student.city = cityName;
        return this;
    }

    public StudentBuilderAddress at(String address) {
        student.address = address;
        return this;
    }

    public StudentBuilderAddress with(String postCode) {
        student.postCode = postCode;
        return this;
    }

}

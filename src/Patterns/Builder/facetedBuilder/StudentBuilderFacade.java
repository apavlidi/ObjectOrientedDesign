package Patterns.Builder.facetedBuilder;

public class StudentBuilderFacade {

    Student student = new Student();

    public StudentBuilderInfo info() {
        return new StudentBuilderInfo(student);
    }

    public StudentBuilderAddress lives() {
        return new StudentBuilderAddress(student);
    }

    public Student build() {
        return student;
    }

}

package SOLID.LSP;

public class MathTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Teaching Math");
    }

}

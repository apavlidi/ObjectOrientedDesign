package SOLID.LSP;

public class SubstituteTeacher implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Teaching history");
    }

}

package SOLID.LSP.School;

public class SubstituteTeacher implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Teaching history");
    }

}

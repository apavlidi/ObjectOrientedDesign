package SOLID.LSP.School;

public class HistoryTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Teaching history");
    }

}

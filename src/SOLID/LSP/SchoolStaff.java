package SOLID.LSP;

public class SchoolStaff {

    private void makeAnnouncement(){
        System.out.println("Making an announcement..");
    }

    private void takeAttendee(){
        System.out.println("Taking attendees..");
    }

    private void collectHomework(){
        System.out.println("Collecting homework");
    }

    public void performRensposibilities(){
        makeAnnouncement();
        takeAttendee();
        collectHomework();
    }

}

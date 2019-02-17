package Patterns.Prototype;

public class App {

    public static void main(String[] args) {
        Address address = new Address("Thessaloniki", "Greece");
        Student student = new Student("alexis", 22, address);

        System.out.println(student);

        Student studentCopy= student.deepCopy();
        studentCopy.setAge(15);
        studentCopy.setName("Kostas");
        studentCopy.getAdress().setCity("Sofia");
        studentCopy.getAdress().setCountry("Bulgaria");

        System.out.println("--After copying-- ");
        System.out.println(student);
        System.out.println(studentCopy);
    }

}

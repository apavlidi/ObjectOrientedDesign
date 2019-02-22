package Patterns.Creational.Prototype;

public class Student {

    private String name;

    private int age;

    private Address adress;

    public Student(String name, int age, Address adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public Student deepCopy(){
        return new Student(name, age, adress.copy());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                '}';
    }
}

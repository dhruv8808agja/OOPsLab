public class Student {
    int roll;
    String name;
    int m1;
    int m2;
    int m3;

    public Student() {
        System.out.println("Null constructor has been called");
    }

    public Student(Student stu) {
        this.roll = stu.roll;
        this.name = stu.name;
        this.m1 = stu.m1;
        this.m2 = stu.m2;
        this.m3 = stu.m3;

        System.out.println("Copy constructor has finished copying");
    }

    public Student(int roll, String name, int m1, int m2, int m3) {
        this.roll = roll;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        System.out.println("Parameterised constructor has finished initialising");
    }

    public void display() {
        System.out.println("This Student object has data values:");
        System.out.println("Name: " + this.name);
        System.out.println("Roll no: " + this.roll);
        System.out.println("Marks1: " + this.m1);
        System.out.println("Marks2: " + this.m2);
        System.out.println("Marks3: " + this.m3);
    }

}
class Maina {


    public static void main(String[] args) {
        System.out.println("Invoking default null constructor: ");
        Student stu = new Student();

        System.out.println("Invoking parameterised constructor");
        Student stu1 = new Student(1, "Dhruv", 99, 98, 97);

        System.out.println("Invoking copy constructor");
        Student stu2 = new Student(stu1);

        System.out.println("Now Printing values initialized using copy constructor");
        stu2.display();
    }

}

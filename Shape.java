import java.util.Scanner;

abstract class Shape {
    static double a,b;


    abstract void printArea();
}

 class Rect extends Shape {
    void printArea()
    {
        System.out.println("Area of Rect: " + (float)(a*b) + "\n");
    }

     public Rect(double a,double b) {
        this.a = a;
        this.b = b;
        printArea();
     }
 }

class Tri extends Shape {
    void printArea(){
        System.out.println("Area of Triangle: " + (float)(0.5 * a * b) + "\n");
    }

    public Tri(double a, double b) {
        this.a = a;
        this.b = b;
        printArea();
    }
}

class Circle extends Shape {
    void printArea(){
        System.out.println("Area of Circle: " + (float)(3.14 * a * b) + "\n");
    }

    public Circle (double a, double b)
    {
        this.a = a;
        this.b = b;
        printArea();
    }


    public static void main(String[] args)
    {
        System.out.println("Enter values of a and b");
        double a,b;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        Rect rect = new Rect(a,b);
        Tri tri = new Tri(a,b);
        Circle circle = new Circle(a,b);
    }

}

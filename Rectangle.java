import java.util.Scanner;

public class Rectangle {
    double length;
    double width;
    double area;
    String color;

    public void set_length(double l)
    {
        this.length = l;
        System.out.println("Length of current instance has been set");
    }
    public void set_width(double w)
    {
        this.width = w;
        System.out.println("Width of current instance has been set");
    }
    public void set_color(String c)
    {
        this.color = c;
        System.out.println("Color of current instance has been set");
    }
    public void set_area()
    {
        area = length * width;
        System.out.println("Area of current instance has been set\n\n");
    }
    public double return_area()
    {
        return this.area;
    }
    public String return_color()
    {
        return this.color;
    }

    public static void main(String[] args)
    {
        double l1,l2,w1,w2,a1,a2;
        String c1,c2;
        Scanner in = new Scanner(System.in);
        Rectangle rect1 = new Rectangle();

        System.out.println("Enter l1 w1 c1");
        l1 = in.nextDouble();
        w1 = in.nextDouble();
        c1 = in.next();

        rect1.set_length(l1);
        rect1.set_width(w1);
        rect1.set_color(c1);
        rect1.set_area();


        Rectangle rect2 = new Rectangle();

        System.out.println("Enter l2 w2 c2");
        l2 = in.nextDouble();
        w2 = in.nextDouble();
        c2 = in.next();

        rect2.set_length(l2);
        rect2.set_width(w2);
        rect2.set_color(c2);
        rect2.set_area();

        if( (rect1.return_area() == rect2.return_area()) && ( rect1.return_color().equalsIgnoreCase(rect2.return_color()) ) )
        {
            System.out.println("\nMatching Rectangles");
        }
        else{
            System.out.println("\nNon Matching Rectangles");
        }
    }

}

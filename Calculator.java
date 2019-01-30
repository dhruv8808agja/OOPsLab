import java.util.Scanner;

public class Calculator {

    int a;
    int b;

    public int addition(int a, int b)
    {
        int result = a + b;
        return result;
    }

    public int multiply(int a, int b)
    {
        int result = a * b;
        return result;
    }

    public int subtract(int a, int b)
    {
        int result = a - b;
        return result;
    }

    public float divide(int a, int b)
    {
        if(b == 0)
            return -999;
        float result = (float) a / b;
        return result;
    }

public static void main(String[] args)
{
    System.out.println("Enter two numbers");
    int a,b;

    Scanner in = new Scanner(System.in);
    a = in.nextInt();
    b = in.nextInt();

    System.out.println("Enter operation: (+ - * /) ");
    char op;
    op = in.next().charAt(0);
    float result;
    Calculator cal = new Calculator();

    if(op == '+')
    {
        result = cal.addition(a, b);
        System.out.println("Result: " + result);
    }
    else if(op == '-')
    {
        result = cal.subtract(a, b);
        System.out.println("Result: " + result);
    }
    else if(op == '*')
    {
        result = cal.multiply(a, b);
        System.out.println("Result: " + result);
    }
    else if(op == '/')
    {
        result = cal.divide(a, b);
        if(result == -999)
        {
            System.out.println("Error / 0 exception");
        }
        else{
            System.out.println("Result: " + result);
        }
    }
    else System.out.println("Wrong input operation!");
}

}

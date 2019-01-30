import java.util.Scanner;
class Sample{


    public Sample(String str)
    {
        System.out.println(str);
    }
}

public class HelloWorld {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Sample obj = new Sample(str);
        //return 0;
    }
}

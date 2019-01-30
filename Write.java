import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Write {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();
        try {
            FileWriter fw = new FileWriter("fil1.txt");
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }


    }
}
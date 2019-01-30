import java.util.Scanner;

class Sorting {

    public static int stringCompare(String str1, String str2)
    {

        int l1 = str1.length();
        int l2 = str2.length();

        for (int i = 0; i < l1 && i < l2; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);

            if (str1_ch == str2_ch) {
                continue;
            }
            else {
                return str1_ch - str2_ch;
            }
        }

        if (l1 < l2) {
            return l1 - l2;
        }
        else if (l1 > l2) {
            return l1 - l2;
        }

        else {
            return 0;
            }
        }


    }



public class Main{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Enter no of strings");
        int n;
        n = in.nextInt();
        //String buffe = new String();

        String[] str = new String[10];

        System.out.println("Enter" + n + "Strings");

        for(int i=0; i<n; i++)
        {str[i] = in.next();}
            //buffe = in.nextLine(); }

        Sorting st = new Sorting();

        for(int i = 0; i<n; i++)
            for(int j = 0; j<n-1 ; j++)
            {
                if((st.stringCompare(str[j], str[j+1]) ) > 0)
                {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        //now string array is swaped, printing

        for(int i = 0; i<n; i++)
        System.out.println(str[i]);

    }



}

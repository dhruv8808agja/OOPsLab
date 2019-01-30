import java.util.Scanner;

public class Toolbooth {
    int toll;
    double totalAmount;

    public Toolbooth() {
        this.toll = 0;
        this.totalAmount = 0;
    }

    void payingVehicle(){
        toll += 1;
        totalAmount += 50;
    }
    void nonpayingVehicle(){
        toll += 1;
    }

    void display()
    {
        System.out.println("Total no of cars: " + toll);
        System.out.println("Total amount: " + totalAmount);
    }

    public static void main(String[] args){
        Toolbooth toolbooth = new Toolbooth();
        while(true)
        {
            System.out.println("1.Paying 2.NonPaying 3.Display");
            int n;
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            switch (n){
                case 1: toolbooth.payingVehicle();
                        break;

                case 2: toolbooth.nonpayingVehicle();
                        break;
                case 3: toolbooth.display();
                        break;
                default: return;
            }
        }

    }

}

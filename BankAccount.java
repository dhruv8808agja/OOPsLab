import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public BankAccount() {
        this.balance = 0;
        this.accountNumber = 0;
    }

    public void createAccount(int accountNumber){
        this.accountNumber = accountNumber;
        System.out.println("Account has been successfully created");
    }
    public void getBalance(){
        System.out.println("Account Balance: " + this.balance);
    }
    public void deposit(int cash){
        balance += cash;
        System.out.println("Balance has been updated");
    }
    public void withdraw(int cash){
        if(this.balance >= cash) {
            balance -= cash;
            System.out.println("Balance has been updated");
        }
        else {
            System.out.println("!! INVALID !! Withdraw amount is more than available balance");
        }
        }
    public void display(){
        System.out.println("Account number: " + accountNumber + " | Balance: " + balance);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        BankAccount bankAccount[] = new BankAccount[100];
        int last = 0;  // last points to where we have to add new account
        for(int i =0 ; i<100; i++)
        {
            bankAccount[i] = new BankAccount();
        }

        while(true)
        {
            System.out.println("1.CreateAccount 2.CheckBalance 3.Deposit 4.Withdraw 5.Display");
            n = in.nextInt();
            switch (n){

                case 1:
                        System.out.println("Enter Account Number ");
                        int accountNo;
                        accountNo = in.nextInt();
                        int v = 1;
                        for(int i=0; i<last; i++)
                        {
                            if( bankAccount[i].getAccountNumber() == accountNo )
                            {
                                System.out.println("!! INVALID !! Account already exist with this account number");
                                v = 0;
                                break;
                            }
                        }

                        if(v == 1){
                            bankAccount[last].createAccount(accountNo);

                            System.out.println("Enter amount to be deposited initially: ");
                            int cash;
                            cash = in.nextInt();
                            bankAccount[last].deposit(cash);
                            last++;
                        }
                        break;

                case 2:
                        System.out.println("Enter Account no of Balance Checking");
                        int b = in.nextInt();
                        int f = 0;
                        for(int i = 0; i<last; i++)
                        {
                            if(b == bankAccount[i].getAccountNumber()){
                                f = 1;
                                bankAccount[i].getBalance();
                            }
                        }
                        if(f == 0)
                        {
                            System.out.println("!! INVALID !! Account not exist");
                        }
                        break;

                case 3:
                        System.out.println("Enter Account Number");
                        b = in.nextInt();
                        f = 0;
                        for(int i = 0; i<last; i++)
                        {
                            if(b == bankAccount[i].getAccountNumber()){
                                f = 1;
                                System.out.println("Enter amount to deposit :");
                                int depo = in.nextInt();
                                bankAccount[i].deposit(depo);
                            }
                        }
                        if(f == 0)
                        {
                            System.out.println("!! INVALID !! Account not exist");
                        }
                        break;
                case 4:
                    System.out.println("Enter Account Number");
                    b = in.nextInt();
                    f = 0;
                    for(int i = 0; i<last; i++)
                    {
                        if(b == bankAccount[i].getAccountNumber()){
                            f = 1;
                            System.out.println("Enter amount to withdraw :");
                            int withd = in.nextInt();
                            bankAccount[i].withdraw(withd);
                        }
                    }
                    if(f == 0)
                    {
                        System.out.println("!! INVALID !! Account not exist");
                    }
                    break;

                case 5:
                    for(int i= 0; i<last; i++)
                        bankAccount[i].display();
                    break;

            }
        }
    }
}

import java.util.Scanner;
class BankACC
{
    private final String n; //Storing THE NAME
    private double bal; // Storing THE INITIAL BALANCE
    public BankACC(String n, double bal)
    {
        this.n = n;
        this.bal = bal;
    }

    public void deposit(double amt) //AMOUNT Deposited
    {
        bal += amt;
        System.out.println("Deposited: ₹" + amt);
    }

    public void withdraw(double amt) //AMOUNT Withdrawn
    {
        if(amt <= bal) 
        {
            bal -= amt;
            System.out.println("Withdrawn: ₹" + amt);
        }
        else
        {
            System.out.println("Insufficient BALANCE");
        }
    }

    public void showBAL() //Displays THE BALANCE
    {
        System.out.println("Current BALANCE: ₹" + bal);
    }

    public void showACCHolder() //Displays THE ACCOUNT HOLDER
    {
        System.out.println("Account HOLDER: " + n);
    }
}

public class BankUSER
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Initial ACC Holder: ");
        String N=sc.nextLine();
        System.out.println("Enter Initial ACC Balance: ");
        int M=sc.nextInt();
        BankACC obj=new BankACC(N,M); //OBJECT CREATION
        while(true) 
        {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show BALANCE");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.println("Choose Option: "); //TAKES User CHOICE 
            int c = sc.nextInt(); //CHECKING User's CHOICE Validity
            switch(c)
            {
                case 1:
                    System.out.print("Enter AMOUNT To Deposit: ");
                    double dep = sc.nextDouble();
                    obj.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter AMOUNT To Withdraw: ");
                    double wd = sc.nextDouble();
                    obj.withdraw(wd);
                    break;

                case 3:
                    obj.showBAL();
                    break;

                case 4:
                    obj.showACCHolder();
                    obj.showBAL();
                    break;

                case 5:
                    System.out.println("YOUR WELCOME, VISIT AGAIN");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
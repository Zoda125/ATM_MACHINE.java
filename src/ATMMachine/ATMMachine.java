package ATMMachine;
import java.util.Scanner;
class ATM{
    float Balance = 8000;
    int PIN = 1234;
    public void checkPin()
    {
        System.out.println("ENTER YOUR PIN");
        Scanner pin = new Scanner(System.in);
        int enterPin = pin.nextInt();
        if(enterPin==PIN)
        {
            menu();
        }
        else {
            System.out.println("INVALID PIN");
        }
    }
    public void menu()
    {
        System.out.println("ENTER YOUR OPTION");
        System.out.println("1- CHECK BALANCE");
        System.out.println("2- WITHDRAW MONEY");
        System.out.println("3- DEPOSIT MONEY");
        System.out.println("4- EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt==1)
        {
            checkBalance();
        } else if (opt==2) {
            withDrawMoney();
        } else if (opt==3) {
            depositMoney();
        } else if (opt==4) {
            return;
        }
        else {
            System.out.println("ENTER A VALID CHOICE");
            menu();
        }
    }


    public void checkBalance()
{
    System.out.println("BALANCE :"+Balance);
    menu();
}
public void withDrawMoney()
{
    System.out.println("ENETER AMOUNT TO WITHDRAW");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    if(amount>Balance)
    {
        System.out.println("INSUFFICIENT BALANCE");
    }
    else {
        Balance = Balance - amount;
        System.out.println("MONEY WITHDRWAL SUCCESSFUL");
        checkBalance();
    }
}
public void depositMoney(){
    System.out.println("ENTER THE AMOUNT");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    Balance+=amount;
    checkBalance();
}
}
public class ATMMachine {
    public static void main(String[]args)
    {
        ATM obj = new ATM();
        obj.checkPin();
    }
}
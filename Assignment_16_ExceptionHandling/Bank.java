package Assignment_16_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class BankUser{
    String name;
    int accId;
    double accBalance;
    public BankUser(String name,int accId,double accBalance)
    {
        this.name=name;
        this.accId=accId;
        this.accBalance=accBalance;
    }
}
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}
class withDraw
{
    Scanner sc=new Scanner(System.in);
    void withDraw(BankUser user) throws InsufficientBalanceException {
        try
        {
            System.out.println("Enter amount you want to withdraw : ");
            double amt=sc.nextDouble();
            if(user.accBalance<=1000)
            {
                throw new InsufficientBalanceException("Insufficient Balance ...!");
            }
            else {
                System.out.println("Remaining Amount : "+(user.accBalance-amt));
                user.accBalance=user.accBalance-amt;
            }
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
public class Bank {
    public static void main(String[] args) throws InsufficientBalanceException {
        BankUser user1=new BankUser("Mithra",01,5000);
        BankUser user2=new BankUser("Vidhya",02,1000);


        withDraw w=new withDraw();

        w.withDraw(user2);




    }
}

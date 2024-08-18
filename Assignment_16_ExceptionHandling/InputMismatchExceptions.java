package Assignment_16_ExceptionHandling;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptions{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      try
      {
          System.out.println("Enter phone Number : ");
          long phoneNumber = sc.nextLong();
          System.out.println("Phone Number : "+phoneNumber);

      }
      catch(InputMismatchException e)
      {
          System.out.println("Input Mismatch Exception");
      }

    }
}

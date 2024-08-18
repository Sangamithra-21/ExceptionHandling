package Assignment_16_ExceptionHandling;

public class DivisionByZero {
    public static void main(String[] args) {
        int a = 10;
        try {
            System.out.println(a / 0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division By Zero Error");
        }
    }
}

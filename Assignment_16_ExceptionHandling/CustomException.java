package Assignment_16_ExceptionHandling;

class MyException extends Exception{
    public MyException(String msg)
    {
        super(msg);
    }
}
public class CustomException{
    public static void main(String[] args) {
        try
        {
            throw new MyException("Custom Exception");
        }
        catch(MyException e)
        {
            System.out.println("Name of Exception : "+e.getMessage());
        }
    }
}
package Assignment_16_ExceptionHandling;


public class ArrayIndexOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        try{
            System.out.println("Number at Position n+1 : "+nums[6]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Out of Bounds Exception Arises!");
            System.out.println(e.getMessage());
        }
    }
}

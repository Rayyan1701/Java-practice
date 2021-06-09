// 1. 

// Write a program in java if number is less than 10 and greater than 50 it generate the exception out of range. Else it
// displays the square of number.
import java.lang.*;
import java.util.Scanner;


class OutOfRange extends Exception
{
      OutOfRange(String s)
      {
          super(s);
      }
}

public class array 
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        try
        {
            System.out.print("enter a number : ");
            a=sc.nextInt();
            if(a<=10 || a>=50)
            {
                throw new OutOfRange("out of Range");
            }

            System.out.print("Square of number : "+a*a);
        }
        catch(OutOfRange e)
        {
           System.out.println("out of Range!!! \n please enter number inbetween 10 to 50");
        }
    }
    
}

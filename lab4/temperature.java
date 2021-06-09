// 3b.
// Create a class temperature with member variable temp. Implement exception
// handling to test if temperature is equal to zero.



import java.lang.*;
import java.util.*;


public  class temperature 
{
    int temp;

    void read(Scanner sc)
    {
        System.out.println("Enter Temperature :-");
         temp=sc.nextInt();
    }
    public static void main(String[] args)
    {
          temperature obj= new temperature();
          Scanner sc= new Scanner(System.in);
          try
          {
               obj.read(sc);
               if(obj.temp<=0)
               {
                    throw new MyException("Temperature less than or equal to Zero");
               } 
               else
               {
                throw new MyException1("Temperature in range");
               }
          }
          catch(MyException e)
          {
            System.out.println(e.getMessage());
          }
          catch(MyException1 e)
          {
            System.out.println(e.getMessage());
          }
          finally
          {
            System.out.println("temperature checked");
          }
    }
    
}


class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
}

class MyException1 extends Exception
{
    MyException1(String s)
    {
        super(s);
    }
}


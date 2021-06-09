// 2) Write a program to enter two numbers from the
// keyboard and pass the numbers to a method divide. The divide method, divides
// the first number with the second number and generates an arithmetic
// exception if the second number is 0.


import java.util.*;

public class arith_exception {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        float i, j;
        float res;
        System.out.println("Enter 2 numbers :-");
        i = sc.nextInt();
        j = sc.nextInt();
        try
        {
            if(j==0)
            {
                throw new ArithmeticException("denomination zero");
            }
            else
            {
                res=(i/j);
                System.out.print("Result : "+res);

            }

        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException -denominator zero");
        }

    }



    
}

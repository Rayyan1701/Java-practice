// 2) Write a program to enter two numbers from the
// keyboard and pass the numbers to a method divide. The divide method, divides
// the first number with the second number and generates an arithmetic
// exception if the second number is 0.


// 3) Repeat the same program by reading the input as
// command line arguments.


public class arith_exception_cmd
{
    public static void main(String[] args) 
    {
        
        float i,j;
        float res;

         i=Float.parseFloat(args[0]);
         j=Float.parseFloat(args[1]);

        
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

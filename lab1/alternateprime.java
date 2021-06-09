class alternateprime
{
    public static int checkprime(int n)
    {
         int k=0;

         for(int i=2;i<n;i++)
         {
              if(n%i==0)
              {
                  k=1;
              }
         }
         if(k==1)
         {
             return 0;
         }
         else
         {
             return 1;
         }
    }

    public static void alternate(int n)
    {
        int k=0;
       
                 for(int i=2;i<n;i++)
                   {
                      if(checkprime(i)==1)
                      {
                          k++;
                          if(k%2!=0)
                     {
                         System.out.println(i);
                     }
                      }
                       
       
            
                   }
                   
            
           
       
       
    }

    public static void main(String[] args)
    {
       int n=12;
         System.out.println("The Alternate prime numbers less than "+n+" are");
        alternate(n);
   

    }
}
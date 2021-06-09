class armstrong
{
    static void armstrong(int n)
    {
        int l=0,sum=0;
           for(int i=0;n>0;i++)
           {
               int temp=i;
               sum=0;
                  while(temp!=0)
                  {
                       l=temp%10;
                       sum+=(l*l*l);
                       temp=temp/10;
                  }
                  if(i==sum)
                  {
                      System.out.println(i);
                      n=n-1;
                  }
              

           }


    }
   

    public static void main(String[] args)
    {
        int n=6;

        armstrong(n);
    }
}
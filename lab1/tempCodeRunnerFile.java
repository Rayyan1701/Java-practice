class fibonacci
{
    public static void main(String[] args)
    {
         int n=10;
        int arr[];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i]=0;
        // }
        //  arr[0]=0; arr[1]=1;
       
        // for(int i=2;i<n;i++)
        // {
        //      arr[i]=arr[i-1]+arr[i-2];
        // }
        // System.out.println("The first "+n+" fibonnaci numbers are:-");
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arr[i]);
        // }

        int a=0,b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n;i++)
          {
              c=a+b;
              a=b;
              b=c;
              System.out.println(c);
          }
    }
}
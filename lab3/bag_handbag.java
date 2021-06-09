import java.util.Scanner;

class bag{
    String contents[]=new String[25];
    int itemcount=0;
     bag()
    {
          for(int i=0;i<25;i++)
          {
              contents[i]=" ";
          }
     }

    int isempty()
    {
        if(itemcount==0)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
    int isfull()
    {
        if(itemcount==25)
        {
            return 1;
        }
        else{
            return 0;
        }
    }

    int exist(Scanner sc)
    {
        String s;
        System.out.print("ENTER THE ITEM name you want to check : ");
        s=sc.nextLine();

        for(int i=0;i<=itemcount;i++)
        {
            if(s.equals(contents[i]))
            {
               
               return 1;
            }
        }
        return 0;
    }

    void put(Scanner sc)
    {
        
        System.out.print("ENTER THE ITEM name you want to add : ");
        contents[itemcount++]=sc.nextLine();
    }

}


class handbags extends bag
{
   
    int maxterms=6;

    int isfull()
    {
        if(this.itemcount==6)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}


public class bag_handbag
 {

    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        bag obj = new handbags();
        obj.put(sc);
        obj.put(sc);
        
        if(obj.exist(sc)==1)
        {
            System.out.println("present");
        }
        else{
            System.out.println(" not present");
        }
        
    }
    
}

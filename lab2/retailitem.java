//Design and create a class named RetailItem that holds data about an item in a retail store. The class
// should have the following fields:
// Description - The description field references a String object that holds a brief description
// of the item.
// Units - The units field is an int variable that holds the number of units currently in
// inventory.
// Price - The price field is a double that holds the item’s retail price.
// appropriate mutator methods that store values in these fields and accessor methods that return the values in these fields. Write the main method which creates a RetailItem object and invokes appropriate methods.
import java.util.*;
class retailitem
{
    String description;
    int units;
    double price;

    void read()
    {
       Scanner input= new Scanner(System.in) ;
       System.out.println("enter description");
       description=input.nextLine();

       System.out.println("enter number of units");
       units=input.nextInt();

       System.out.println("enter price");
       price=input.nextDouble();
       System.out.println();System.out.println();
       
    }

    void display()
    {
         System.out.println("Description:-");
        System.out.println(description);
         System.out.println("Units:-");
        System.out.println(units);
         System.out.println("price:-");
        System.out.println(price);
        System.out.println();System.out.println();
    }
    public static void main(String[] args)
    {
        retailitem obj[]=new retailitem[5];
       for(int i=0; i<3; i++)
       {
           obj[i]= new retailitem();
           System.out.println("Enter details if item "+(i+1));
            obj[i].read();
            
       }
       for(int i=0; i<3; i++)
       {
           System.out.println("The details of item "+(i+1));
            obj[i].display();
            
       }
    }
}
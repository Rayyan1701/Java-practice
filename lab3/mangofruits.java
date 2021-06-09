import java.util.Scanner;

class fruits
{
    int unit_price=0;
    int quantity=0;

    void readdata(Scanner sc)
    {
        System.out.print("ENTER THE price per unit : ");
        unit_price=sc.nextInt();
        System.out.print("ENTER THE quantity : ");
        quantity=sc.nextInt();

    }
    void display()
    {
        System.out.println("unit price : "+unit_price);
        System.out.println("Quantity : "+quantity);
        System.out.println("Totalcost : "+this.totalcost());
        
    }

    int totalcost()
    {
        return (unit_price*quantity);
    }
    


}

class mango extends fruits
{
    String name="mango";
    String taste="sweet";

    void makejuice()
    {
        System.out.println("Making juice........");
        System.out.println("juice name : "+name);
        System.out.println("made...\n taste : "+taste);
    }
}





public class mangofruits {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
          mango obj = new mango();

          obj.readdata(sc);
          obj.display();
          obj.makejuice();
    }
    
}

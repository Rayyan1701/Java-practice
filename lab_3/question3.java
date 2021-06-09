import java.util.*;
abstract class Shape
{
     abstract double area();

}

interface Ipoint
{
    void inputsides(Scanner sc);
}

class triangle extends Shape implements Ipoint
{
    int height;
    int base;
    triangle()
    {
         height=0;
         base=0;
    }
    triangle(int a,int b)
    {
         height=a;
         base=b;
    }

    double area()
    {
        return (0.5*base*height);
    }

    public void inputsides(Scanner sc)
    {
          System.out.print(("Enter Base of triangle : "));
          base=sc.nextInt();

          System.out.print(("Enter Height of triangle : "));
          height=sc.nextInt();

    }
}

class Circle extends Shape
{
    int Radius;
   final double pi=3.14;
    
    Circle()
    {
         Radius=0;
         
    }
    Circle(int a)
    {
         Radius=a;
         
    }

    double area()
    {
        return (pi*Radius*Radius);
    }
}


class threeDCircle extends Circle
{
    int Radius;
   final double pi=3.14;
    
    threeDCircle()
    {
         Radius=0;
         
    }
    threeDCircle(int a)
    {
         Radius=a;
         
    }

    double area()
    {
        return ((4/3)*pi*Radius*Radius*Radius);
    }
}



class Hexagon extends Shape implements Ipoint
{
    int side;
   
    
    Hexagon()
    {
         side=0;
         
    }
    Hexagon(int a)
    {
         side=a;
         
    }

    double area()
    {
        return (2.59*side*side);
    }

    public void inputsides(Scanner sc)
    {
          System.out.print(("Enter side of Hexagon : "));
          side=sc.nextInt();

    }
}









public class question3 {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
       Hexagon obj =new Hexagon();
        obj.inputsides(sc);
        // Hexagon obj1;
        // obj1=obj;
        System.out.println("Hexagon Area :"+obj.area());

    }
    
}

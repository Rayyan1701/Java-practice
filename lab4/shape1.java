import java.util.*;


class shape1
{
    public static void main(String[] args)
    {
        
            Scanner sc= new Scanner(System.in);
           Rectangle obj =new Rectangle();
            obj.input(sc);
            // Rectangle obj1;
            // obj1=obj;
            System.out.println("Rectangle Area :"+obj.calculate_area());
    
        
    }
}
 abstract class Shape
{
     abstract double calculate_area();
     abstract void display();
      abstract void input(Scanner sc);
    

}


class triangle extends Shape
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

    double calculate_area()
    {
        return (0.5*base*height);
    }

    void display()
    {
    
          System.out.println("Area of   ="+calculate_area());
    }

     void input(Scanner sc)
    {

            height= sc.nextInt();  
            base= sc.nextInt();  
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

    double calculate_area()
    {
        return (pi*Radius*Radius);
    }
    void display()
    {
        System.out.println("Area of   ="+calculate_area());
    }

     void input(Scanner sc)
    {
            Radius= sc.nextInt();  
    }
}


class Rectangle extends Circle
{
    int height;
    int base;
    Rectangle()
    {
         height=0;
         base=0;
    }
    Rectangle(int a,int b)
    {
         height=a;
         base=b;
    }

    double calculate_area()
    {
        return (base*height);
    }

    void display()
    {
    
          System.out.println("Area of   ="+calculate_area());
    }

     void input(Scanner sc)
    {
        System.out.println("Enter height:-");
            height= sc.nextInt();  
            System.out.println("Enter width:-");
            base= sc.nextInt();  
    }
}





import fpack.C;
public class A extends C {

   protected void display()
    {
        super.display();
    }
    public static void main(String[] args)
    {
        B obj= new B();
        obj.display();   
        
        A obj1= new A();
        obj1.display();
    }
}

interface B
{
    int methodB(int i);
}
class A implements B
{  
    public int methodB(int i)
    {
        return( i =+ i * i);
    }
}
 
 public class MainClass
{
    public static void main(String[] args)
    {
        B b = new B();
        System.out.println(b.methodB(3));
    }
}
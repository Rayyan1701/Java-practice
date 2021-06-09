import java.util.*;
class A
{
     private int a;
     private int b;
    protected float c;
    protected float d;
     public int e;
     public int f;

     A(int a,int b ,float c,float d,int e,int f)
     {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
     }
     A()
     {
         a=10;
         b=33;
        c=9;
        d=10;
        e=11;
        f=12;
     }
}

class B extends A
{
    B(int a,int b ,float c,float d,int e,int f)
    {
        super(a,b,c,d,e,f);
    }
    B()
    {
        super.c=9;
        super.d=10;
        super.e=11;
        super.f=12;
    }

    void display()
    {
        System.out.println("the numbers are :- "+c+" "+d+" "+e+" "+f);
    }

    final void add()
    {
        System.out.println("the sum is :="+(c+d+e+f));
    }

}

class C extends B
{
    C(int a,int b ,float c,float d,int e,int f)
    {
         super(a,b,c,d,e,f);
    }
    C()
    {
        super.c=9;
        super.d=10;
        super.e=11;
        super.f=12;
    }

    void display()
    {
        System.out.println("the numbers are :- ");
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        

    }

    

}

final class D extends B
{
    D(int a,int b ,float c,float d,int e,int f)
    {
         super(a,b,c,d,e,f);
    }
    D()
    {
        super.c=9;
        super.d=10;
        super.e=11;
        super.f=12;
    }

    void display()
    {
        System.out.println("the numbers are :- ");
        System.out.print(c);
        System.out.println(d);
        System.out.print(e);
        System.out.println(f);
        

    }
}


public class Inhertance_Q1 
{
    public static void main(String[] args)
    {
        B objc =new C();
          objc.add();
          objc.display();
    }    
}

// 1) Implement a growable stack using interface and
// class. Interface will contain abstract methods push() and pop().


import java.util.*;

interface stack_functions
{
    public void push(int i);
    public void pop();
}
public class stack implements stack_functions
{
    int arr[]=new int[20];
    int top=-1;
    public void push(int i)
    {
       arr[++top]=i;
    }
    public void pop()
    {
        top--;
    }
    boolean empty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int top()
    {
        if(!empty())
        {
            return arr[top]; 
        }
        return 404;
    }
    void display()
    {
        for(int i=top;i>-1;i--)
        {
            System.out.println(arr[i]);     
        }
    }

    public static void main(String[] arr)
    {
        Scanner sc= new Scanner(System.in);
        stack s= new stack();
        System.out.println("Enter 3 numbers to push into stack");
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        System.out.println("Current stack:-");
        s.display();
        s.pop();
        System.out.println("Current stack after 1 pop:-");
        s.display();

        System.out.println("top:-"+s.top());

    }

    
}

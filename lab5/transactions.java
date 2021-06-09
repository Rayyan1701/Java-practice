// 4
// a. Consider a Bus reservation system that allows online reservations to its
// customers. Suppose there are two transactions of reservation for a particular seat
// simultaneously which leads to race condition. Develop a solution to avoid the
// unpredictable situation with a program.

import java.lang.*;
import java.util.Scanner;

class bus 
{
    boolean allocated[] = new boolean[40];
    String name[] = new String[40];
    static int max = 40;

    bus() {
        for (int i = 0; i < 40; i++) {
            this.allocated[i] = false;
        }
    }
    
    synchronized void update() {

        int x;
        String s;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter Name : ");
            s = sc.nextLine();
            System.out.print(s+" please Enter seat number : ");
            x = sc.nextInt();

       
       
        try {

            
            if (x > 40) {
                throw new Exception();
            }

            if (this.allocated[x] == true) {
                throw new ArithmeticException();
            } else {
                this.allocated[x] = true;
                this.name[x] = s;
                System.out.println("seat number " + x + " reserved for "+s);
            }
        } catch (ArithmeticException i) {
            System.out.println("Sorry " + s + " Seat number already reserved");
        } catch (Exception e) {
            System.out.println("Seat number not valid");
        }

    }

}

class mythread extends Thread {
    static bus obj = new bus();
    String name;

   public void run() {
      
      

        obj.update();

    }

}

public class transactions {
   static void printbus() {
        System.out.println("Choose your seat number");
        for (int i = 0; i < 40; i++) {
            System.out.println((i++) + " " + (i++) + "   " + (i++) + " " + (i++));
        }
    }

    public static void main(String[] args) {

        mythread thread1 = new mythread();
        mythread thread2 = new mythread();
       printbus();
        thread1.start();
        thread2.start();

    }

}

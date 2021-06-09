// 3
// a. Consider a student examination database
// system that prints the mark sheet of the students.  Input the following from the command line
// student name and marks in 6 subjects. 
// These marks should be in between 0 and 50 if the marks are not in the
// specified range raise a Range Exception else find the total marks and print the
// percentage of the student.




import java.lang.*;


class studentdatabase {

    String name;
    int marks[] = new int[6];

    void display_avg() {
        int avg = 0;
        for (int i = 0; i < 6; i++) {
            avg += marks[i];
        }
        avg /= 6;
        System.out.println("\nName :- " + name);
        System.out.println("Subject 1 ="+marks[0]);
        System.out.println("Subject 2 ="+marks[1]);
        System.out.println("Subject 3 ="+marks[2]);
        System.out.println("Subject 4 ="+marks[3]);
        System.out.println("Subject 5 ="+marks[4]);
        System.out.println("Subject 6 ="+marks[5]);
        System.out.println("AVERAGE Marks :- " + avg);

    }

    public static void main(String args[])
    {
        studentdatabase obj=new studentdatabase();
        String s;
        int l;

       try
       {
        //System.out.println(args.length);

        if(args.length != 7)
        {
            
            throw new MyException("WrongInput");
        }
        obj.name=args[0];
         
        for(int i=0;i<6;i++)
       {
           l=Integer.parseInt(args[i+1]);
           if(l>=0 && l<=50)
           {
           
            obj.marks[i]=l;
           }
           else{
               s="RangeException";
               throw new MyException(s);
           }
       }

       obj.display_avg();
       }
       catch(MyException e)
       {
        System.out.println(e.getMessage());
        
       }


    }
}

class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
}


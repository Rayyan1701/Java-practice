import java.util.Scanner;

class student {
    String name;
    double rollno;
    String USN;

    void displaystudent() {
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + rollno);
        System.out.println("USN : " + USN);
    }
}

class exam extends student {
    int marks[]={0,0,0,0,0,0};
    String subjects[] = { "Java", "DBMS", "TFC", "LIA", "ADA", "UNIX" };

    void displaymarks() {
        this.displaystudent();
        System.out.println("\nMarks:-");
        for (int i = 0; i < 6; i++) {
            System.out.println(subjects[i] + " -> " + marks[i]);
        }



    }

    void readmarks(Scanner sc) {
        System.out.println("Enter Marks:-");
        for (int i = 0; i < 6; i++) {
            System.out.print("\n" + subjects[i] + " :-");
            marks[i] = sc.nextInt();
        }
    }

}

class result extends exam {
    double totalmarks;
    double average;

    result() {

        totalmarks = 0;
        for (int i = 0; i < 6; i++) {
            // marks[i]=0;
        }

        average = (totalmarks / 6);

    }

    void displayresult() {
        this.displaystudent();

        System.out.println("Total marks : " + totalmarks);
        System.out.println("average : " + average);
    }

    void read(Scanner sc) {
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.print("Enter roll number :");
        rollno = sc.nextDouble();
        
        System.out.println("Enter USN :");
        USN = sc.nextLine();

        this.readmarks(sc);

        totalmarks = 0;
        for (int i = 0; i < 6; i++) {
            totalmarks += marks[i];
        }

        average = (totalmarks / 6);

    }
}

class studentexamresult {
    public static void main(String[] args) {
        result obj = new result();
        Scanner sc = new Scanner(System.in);
               obj.totalmarks=2.8999;
        obj.read(sc);

        obj.displayresult();

    }
}

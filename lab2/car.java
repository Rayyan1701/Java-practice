class car
{
    int speed;

    void accelerate()
    {
         speed+=5;
    }
    void break1()
    {
        speed=0;
    }

    void display()
    {
       System.out.println("Speed:-");
        System.out.println(speed);
    }
    public static void main(String[] args)
    {
        car obj= new car();
         System.out.println("Accelerating....");
        for(int i=0;i<5;i++)
        {
             System.out.println("Accelerating....");
            obj.accelerate();
        }

        obj.display();

        obj.break1();
        System.out.println("the speed after applying break1:-");
        obj.display();

    }
}
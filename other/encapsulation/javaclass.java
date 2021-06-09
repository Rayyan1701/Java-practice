class Circle
{
    int x=0,y=0;
    double r=0;

    double circum()
    {
        return (2*3.14*r);
    }
    double area()
    {
        return(3.14*this.r*this.r);
    }

    // Circle(double x,double y,double z)
    // {
    //     this.x=x;this.y=y;r=z;
    // }


}

class javaclass
{
    public static void main(String[] args)
    {
         Circle obj = new Circle();
        obj.x=1;obj.y=2;obj.r=4;

        System.out.println("circum= "+area1(4));

    }
    
    
}

double area1(int r)
    {
        return(3.14*r*r);
    }
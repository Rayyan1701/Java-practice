import java.awt.*;

public class firstawt extends Frame
{
    public static void main(String[] args)
    {
        Frame f= new Frame("frame in java");

      
        Button b1= new Button("b1",100,100);
        f.add(b1);
        f.resize(500, 500);
        f.setBackground(Color.blue);
        f.show();

    }
    
}

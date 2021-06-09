import java.applet.Applet;
import java.awt.Graphics;

public class helloworld extends Applet
{

    public void init()
    {
        resize(400,400);
    }
    public void paint(Graphics g)
    {
        g.drawString("Hello world",300,300);
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener
{
    JFrame f;
    JTextField tf;
    calculator()
    {
       f= new JFrame("My Calculator");
       JPanel panel= new JPanel();
       panel.setLayout(new FlowLayout());


       tf= new JTextField(" ");
       tf.setSize(100,30);
       JButton b0= new JButton("0");
       JButton b1= new JButton("1");
       JButton b2= new JButton("2");
       JButton b3= new JButton("3");
       JButton b4= new JButton("4");
       JButton b5= new JButton("5");
       JButton b6= new JButton("6");
       JButton b7= new JButton("7");
       JButton b8= new JButton("8");
       JButton b9= new JButton("9");
       JButton ba= new JButton("+");
       JButton bs= new JButton("-");
       JButton bm= new JButton("*");
       JButton bd= new JButton("/");

       b0.addActionListener(this);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       b4.addActionListener(this);
       b5.addActionListener(this);
       b6.addActionListener(this);
       b7.addActionListener(this);
       b8.addActionListener(this);
       b9.addActionListener(this);
       ba.addActionListener(this);
       bs.addActionListener(this);
       bm.addActionListener(this);
       bd.addActionListener(this);



       panel.add(tf); 
       panel.add(ba);panel.add(bs);panel.add(bm);panel.add(bd); 



       f.add(panel);

       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f.setSize(400,500);


    }

    public void actionPerformed(ActionEvent e)
    {
        String s= e.getActionCommand();


       
    }



    public static void main(String[] args)
    {
        calculator obj= new calculator();

    }
}


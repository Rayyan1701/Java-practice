import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();

    public GUI() {

        // the clickable button
        JButton button = new JButton("Click Me");
        button.addActionListener(this);
        button.setBounds(10, 10, 30, 10);


        JButton button1 = new JButton("Click Me here");
        button1.addActionListener(
          new ActionListener()
          {
              public void actionPerformed(ActionEvent e)
              {
                clicks-=1;
                label.setText("Number of clicks:  " + clicks);

              }
          }


        );
        button1.setBounds(10, 50, 30, 10);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        
        panel.add(label);
        panel.add(button1);
        //panel.setLayout(new Flowlayout());

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,500);
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:  " + clicks);
    }

    // create one Frame
    public static void main(String[] args) {
        GUI OBJ=new GUI();
    }
}
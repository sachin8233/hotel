package sharedCodes;

import javax.swing.*;

public class StandardBackground extends JFrame {
    public static JFrame GetNewFrame(){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setResizable(false);
        return frame;
    }
}

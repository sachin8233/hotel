package restaurant;

import Start.StartPoint;
import sharedCodes.StandardBackground;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestaurantMainPage {
    public static void main(String[] args) {
        new RestaurantMainPage();
    }
    public RestaurantMainPage(){
        JFrame frame= StandardBackground.GetNewFrame();
        JButton button=new JButton("Book a table");
        JButton button1=new JButton("Explore menu");
        JButton backButton=new JButton("back");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookATable();
                frame.dispose();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExploreMenu();
                frame.dispose();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StartPoint();
                frame.dispose();

            }
        });

        button.setBounds(150,105,200,30);
        button1.setBounds(150,235,200,30);
        backButton.setBounds(0,0,100,30);
        frame.add(button);
        frame.add(button1);
        frame.add(backButton);
        frame.add(backButton);
        frame.repaint();
    }
}

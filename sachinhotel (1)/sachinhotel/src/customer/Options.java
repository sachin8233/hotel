package customer;

import Start.StartPoint;
import hotel.HotelMainPage;
import restaurant.RestaurantMainPage;
import sharedCodes.StandardBackground;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options {
    public static void main(String[] args) {
        new Options();

    }
    public Options(){
        JFrame frame = StandardBackground.GetNewFrame();
        JButton backButton=new JButton("back");
        JButton restaurant=new JButton("Go To Restaurant");
        JButton hotel=new JButton("Go To Hotel");
        restaurant.setBounds(150,150,200,30);
        hotel.setBounds(150,250,200,30);
        backButton.setBounds(0,0,100,30);
        restaurant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RestaurantMainPage();
                frame.dispose();

            }
        });
        hotel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HotelMainPage();
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
        frame.add(restaurant);
        frame.add(hotel);
        frame.add(backButton);
        frame.repaint();

    }
}

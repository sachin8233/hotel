package hotel;

import sharedCodes.StandardBackground;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contact {
    public static void main(String[] args) {
    new Contact();
    }
    Contact(){
        JFrame frame= StandardBackground.GetNewFrame();
        JLabel reception=new JLabel("Reception");
        JLabel manager=new JLabel("Manager");
        JLabel email=new JLabel("Email");
        JLabel restaurant=new JLabel("Restaurant");
        JLabel quaries=new JLabel("Quaries");

        JLabel reception1=new JLabel("123123");
        JLabel manager1=new JLabel("234234");
        JLabel email1=new JLabel("dummy@email.com");
        JLabel restaurant1=new JLabel("345345");
        JLabel quaries1=new JLabel("456456");

        JButton backButton=new JButton("back");

        reception.setBounds(100,100,100,50);
        manager.setBounds(100,150,100,50);
        email.setBounds(100,200,100,50);
        restaurant.setBounds(100,250,100,50);
        quaries.setBounds(100,300,100,50);

        reception1.setBounds(300,100,100,50);
        manager1.setBounds(300,150,100,50);
        email1.setBounds(300,200,200,50);
        restaurant1.setBounds(300,250,100,50);
        quaries1.setBounds(300,300,100,50);
        backButton.setBounds(0,0,100,30);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HotelMainPage();
                frame.dispose();

            }
        });

        frame.add(reception);
        frame.add(manager);
        frame.add(email);
        frame.add(restaurant);
        frame.add(quaries);
        frame.add(reception1);
        frame.add(manager1);
        frame.add(email1);
        frame.add(restaurant1);
        frame.add(quaries1);
        frame.add(backButton);
        frame.repaint();



    }

}

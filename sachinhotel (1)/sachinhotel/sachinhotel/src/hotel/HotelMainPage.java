package hotel;

import customer.Options;
import restaurant.BookATable;
import restaurant.ExploreMenu;
import sharedCodes.StandardBackground;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelMainPage {
    public HotelMainPage() {
        JButton backButton = new JButton("back");
        JFrame frame = StandardBackground.GetNewFrame();
        JButton button = new JButton("Book a Room");
        JButton button1 = new JButton("Contact");

        button.setBounds(150, 105, 200, 30);
        button1.setBounds(150, 235, 200, 30);
        backButton.setBounds(0, 0, 100, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new BookARoom();
                frame.dispose();
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Contact();

                frame.dispose();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Options();
                frame.dispose();

            }
        });
        frame.add(button);
        frame.add(button1);
        frame.add(backButton);
        frame.repaint();

    }

    public static void main(String[] args) {
        new HotelMainPage();

    }
}

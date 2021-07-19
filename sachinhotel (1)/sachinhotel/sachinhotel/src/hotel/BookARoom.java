package hotel;

import restaurant.RestaurantMainPage;
import sharedCodes.StandardBackground;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum TypesOfRooms {
   King, Queen, Single, Double, Suite
}

public class BookARoom {
    BookARoom() {
        JFrame frame = StandardBackground.GetNewFrame();
        JButton backButton=new JButton("back");
        JLabel date = new JLabel("Start Date");
        JLabel date1 = new JLabel("Last Date");
        JLabel time = new JLabel("Start Time");
        JLabel time1 = new JLabel("End Time");
        JTextField dateImput = new JTextField();
        JTextField dateImput1 = new JTextField();
        JTextField timeInput = new JTextField();
        JTextField timeInput1 = new JTextField();
        JComboBox typeOfTable = new JComboBox();
        JButton book = new JButton("Book");
        AddItimes(typeOfTable);
        date.setBounds(100, 50, 100, 50);
        date1.setBounds(100, 100, 100, 50);
        time.setBounds(100, 150, 100, 50);
        time1.setBounds(100, 200, 100, 50);
        dateImput.setBounds(250, 50, 150, 30);
        dateImput1.setBounds(250, 100, 150, 30);
        timeInput.setBounds(250, 150, 150, 30);
        timeInput1.setBounds(250, 200, 150, 30);
        typeOfTable.setBounds(200, 250, 100, 30);
        book.setBounds(200, 350, 100, 30);
        backButton.setBounds(0,0,100,30);

        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RestaurantMainPage();
                frame.dispose();
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HotelMainPage();
                frame.dispose();

            }
        });

        frame.add(date);
        frame.add(time);
        frame.add(dateImput);
        frame.add(timeInput);
        frame.add(typeOfTable);
        frame.add(book);
        frame.add(date1);
        frame.add(time1);
        frame.add(timeInput1);
        frame.add(dateImput1);
        frame.add(backButton);
        frame.repaint();


    }

    public static void main(String[] args) {
        new BookARoom();

    }

    private static void AddItimes(JComboBox box) {
        for(TypesOfRooms i: TypesOfRooms.values()){
            box.addItem(i);
        }


    }
}




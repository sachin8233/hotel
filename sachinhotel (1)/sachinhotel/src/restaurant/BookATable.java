package restaurant;

import sharedCodes.StandardBackground;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookATable {
    public static void main(String[] args) {
        new BookATable();
    }
    BookATable(){
        JFrame frame= StandardBackground.GetNewFrame();
        JButton backButton=new JButton("back");
        JLabel date=new JLabel("Date");
        JLabel time=new JLabel("Time");
        JTextField dateImput=new JTextField();
        JTextField timeInput=new JTextField();
        JComboBox typeOfTable=new JComboBox();
        JButton book=new JButton("Book");
        AddItimes(typeOfTable);
        date.setBounds(100,50,100,50);
        time.setBounds(100,150,100,50);
        dateImput.setBounds(250,50,150,30);
        timeInput.setBounds(250,150,150,30);
        typeOfTable.setBounds(200,250,100,30);
        book.setBounds(200,350,100,30);
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
                new RestaurantMainPage();
                frame.dispose();

            }
        });

        frame.add(date);
        frame.add(time);
        frame.add(dateImput);
        frame.add(timeInput);
        frame.add(typeOfTable);
        frame.add(book);
        frame.add(backButton);
        frame.repaint();


    }
    private static void AddItimes(JComboBox box){
        for(TypesOfTables i:TypesOfTables.values()){
            box.addItem(i);
        }

    }
}
enum TypesOfTables{
    Premium, Delux, Couple, Single, Party
}

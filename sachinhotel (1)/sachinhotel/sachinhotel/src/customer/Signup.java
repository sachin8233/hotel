package customer;


import Start.StartPoint;
import sharedCodes.StandardBackground;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup {
    public Signup() {
        JFrame frame = StandardBackground.GetNewFrame();
        JButton backButton=new JButton("back");
        JLabel name = new JLabel("Name");
        JLabel password = new JLabel("Password");
        JLabel email = new JLabel("Email");
        JLabel phoneNumber = new JLabel("Phone Number");
        JButton signup = new JButton("Sign Up");

        JTextField nameText = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JTextField emailText = new JTextField();
        JTextField nnumberField = new JTextField();

        name.setBounds(100, 50, 100, 50);
        password.setBounds(100, 120, 100, 50);
        email.setBounds(100, 220, 100, 50);
        phoneNumber.setBounds(100, 320, 100, 50);
        nameText.setBounds(250, 55, 150, 30);
        passwordField.setBounds(250, 125, 150, 30);
        emailText.setBounds(250, 225, 150, 30);
        nnumberField.setBounds(250, 325, 150, 30);
        signup.setBounds(225, 400, 100, 40);
        backButton.setBounds(0,0,100,30);

        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StartPoint();
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


        frame.add(name);
        frame.add(password);
        frame.add(email);
        frame.add(phoneNumber);
        frame.add(nameText);
        frame.add(passwordField);
        frame.add(emailText);
        frame.add(nnumberField);
        frame.add(signup);
        frame.add(backButton);
        frame.repaint();

    }

    public static void main(String[] args) {
        new Signup();
    }
}

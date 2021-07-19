package Start;

import customer.Options;
import customer.Signup;
import sharedCodes.StandardBackground;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPoint {
    public StartPoint() {
        JFrame frame = StandardBackground.GetNewFrame();
        JLabel username = new JLabel("Username");
        JLabel password = new JLabel("Password");
        JTextField usernameInput = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton button = new JButton("Login");
        JButton button1 = new JButton("Signup");


        username.setBounds(70, 50, 100, 50);
        usernameInput.setBounds(70, 120, 150, 30);
        password.setBounds(270, 50, 100, 50);
        passwordField.setBounds(270, 120, 150, 30);
        button.setBounds(170, 200, 100, 30);
        button1.setBounds(170, 250, 100, 30);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Signup();
                frame.dispose();

            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Options();
                frame.dispose();
            }
        });



        frame.add(username);
        frame.add(password);
        frame.add(usernameInput);
        frame.add(passwordField);
        frame.add(button);
        frame.add(button1);
        frame.repaint();


    }

    public static void main(String[] args) {
        new StartPoint();


    }

}

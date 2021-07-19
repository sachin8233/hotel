package restaurant;

import sharedCodes.StandardBackground;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

enum ItemList {
    Paneer, Chicken

}

public class ExploreMenu {
    static Map<String, Integer> list = new HashMap<>();

    ExploreMenu() {
        MakeList();
        String nameOfItem = "Item";
        JFrame frame = StandardBackground.GetNewFrame();
        JButton backButton=new JButton("back");
        frame.setLayout(new FlowLayout());

        for (ItemList i : ItemList.values()) {
            nameOfItem = "Item";
            nameOfItem = nameOfItem + i.toString();
            frame.add(GetFoodItemPanel(i.toString(), list.get(i.toString()).toString()));


        }
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        new ExploreMenu();
    }

    private static void MakeList() {
        list.put("Paneer", 100);
        list.put("Chicken", 200);

    }

    private static JPanel GetFoodItemPanel(String s1, String s2) {

        JPanel panel = new JPanel();
        JLabel name = new JLabel(s1);
        JLabel cost = new JLabel(s2);
        panel.setSize(200, 100);
        panel.setLayout(new FlowLayout());
        panel.add(name);
        panel.add(cost);

        return panel;
    }
}


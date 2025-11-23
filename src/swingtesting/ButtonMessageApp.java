package swingtesting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ButtonMessageApp{
    public static void main(String[] args) {
        // Create the main window (frame)
        JFrame frame = new JFrame("Button Message App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create a text area (for showing messages)
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);  // user can’t type in it
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create a button
        JButton button = new JButton("South");
        frame.add(button, BorderLayout.SOUTH);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date (e.getWhen()));
                textArea.append("South " + date + "\n");
            }
        });

        JButton button2 = new JButton("East");
        frame.add(button2, BorderLayout.EAST);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date (e.getWhen()));
                textArea.append("East " + date + "\n");
            }
        });

        JButton button3 = new JButton("North");
        frame.add(button3, BorderLayout.NORTH);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date (e.getWhen()));
                textArea.append(e.getModifiers() + "North" + date + "\n");
            }
        });

        JButton button4 = new JButton("West");
        frame.add(button4, BorderLayout.WEST);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date (e.getWhen()));
                textArea.append("West " + date + "\n");
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                textArea.append("Mouse Entered\n");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                textArea.append("Mouse Exited\n");
            }
        });


        // Make the window visible
        frame.setVisible(true);

        System.out.println("End of Main method");
    }
}

class ActionListener implements java.awt.event.ActionListener {
}
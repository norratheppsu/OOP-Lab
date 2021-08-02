/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Oak
 */
public class LoginDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FrameDemo");      
        JLabel welcomeMessage = new JLabel("Welcome!");
        welcomeMessage.setBounds(160, 50, 200, 30);     
        JTextField username = new JTextField("Enter Username");  
        username.setBounds(100,100, 200,30);  
        JTextField password = new JTextField("Password");  
        password.setBounds(100,150, 200,30);       
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 200, 80, 50);
        loginButton.addActionListener(new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent e) { 
                if(username.getText().equals("Hello") && password.getText().equals("World")) {
                    JDialog dialog = new JDialog(frame, "Pop-up Dialog", false);
                    JTextField loginMessage = new JTextField("You are authorized to log-in!");  
                    dialog.add(loginMessage);
                    dialog.pack();
                    dialog.setVisible(true);
                }     
            } 
        });
        frame.add(welcomeMessage); frame.add(username); frame.add(password); frame.add(loginButton);   
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);  
        frame.setVisible(true);    
    }
}


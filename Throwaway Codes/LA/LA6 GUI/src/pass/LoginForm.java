package pass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2));

        // Username TextField
        JTextField userNameTextField = new JTextField();
        userNameTextField.setName("userNameTextField"); // Set component name

        // Password TextField (use JPasswordField for masking)
        JPasswordField passwordTextField = new JPasswordField();
        passwordTextField.setEchoChar('*');
        passwordTextField.setName("passwordTextField");

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setName("loginButton");

        // Status dialog
        JDialog statusDialog = new JDialog(frame, "Status", true);
        statusDialog.setName("statusDialog");
        statusDialog.setSize(200, 100);
        statusDialog.setLayout(new FlowLayout());

        // Status message label
        JLabel messageLabel = new JLabel("");
        messageLabel.setName("messageLabel");
        statusDialog.add(messageLabel);

        // Add components to frame
        frame.add(new JLabel("Username:"));
        frame.add(userNameTextField);

        frame.add(new JLabel("Password:"));
        frame.add(passwordTextField);

        frame.add(new JLabel());
        frame.add(loginButton);

        // Login button logic
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userNameTextField.getText();
                String password = new String(passwordTextField.getPassword());

                if (username.equals("admin") && password.equals("admin")) {
                    messageLabel.setText("Login Successful!");
                } else {
                    messageLabel.setText("Login Failed!");
                }
                statusDialog.setVisible(true);
            }
        });

        // Show the frame
        frame.setVisible(true);
    }
}


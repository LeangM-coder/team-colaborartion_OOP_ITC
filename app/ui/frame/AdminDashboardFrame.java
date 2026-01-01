package app.ui.frame;

import javax.swing.*;
import java.awt.*;

public class AdminDashboardFrame extends JFrame {

    public AdminDashboardFrame() {

        setTitle("Admin Sign Up");
        setSize(1024, 768); // ✅ iPad size
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel(null);
        panel.setBackground(Color.BLACK);

        // Title
        JLabel title = new JLabel("Sign up");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(300, 80, 200, 40);
        panel.add(title);

        // Username label
        JLabel userLabel = new JLabel("Username");
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        userLabel.setBounds(230, 200, 300, 30);
        panel.add(userLabel);

        // Username field
        JTextField usernameField = new JTextField();
        usernameField.setBounds(230, 235, 300, 40);
        usernameField.setBackground(Color.BLACK);
        usernameField.setForeground(Color.WHITE);
        usernameField.setCaretColor(Color.WHITE);
        usernameField.setBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY)
        );
        panel.add(usernameField);

        // Password label
        JLabel passLabel = new JLabel("Password");
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        passLabel.setBounds(230, 310, 300, 30);
        panel.add(passLabel);

        // Password field
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(230, 345, 300, 40);
        passwordField.setBackground(Color.BLACK);
        passwordField.setForeground(Color.WHITE);
        passwordField.setCaretColor(Color.WHITE);
        passwordField.setBorder(
                BorderFactory.createMatteBorder(0, 0, 1, 0, Color.GRAY)
        );
        panel.add(passwordField);

        // Continue button
        JButton continueBtn = new JButton("Continue");
        continueBtn.setBounds(230, 430, 300, 50);
        continueBtn.setBackground(new Color(245, 201, 75));
        continueBtn.setFont(new Font("Arial", Font.BOLD, 16));
        continueBtn.setFocusPainted(false);
        panel.add(continueBtn);

        add(panel);

        continueBtn.addActionListener(e -> {
            new AdminDashboardView();
            dispose();
        });

        setVisible(true);
    }
}

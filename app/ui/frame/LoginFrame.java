package app.ui.frame;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {

        setTitle("SabayNas Login");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel(null);
        panel.setBackground(Color.WHITE);

        JLabel title = new JLabel("Welcome to SabayNas", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setBounds(200, 200, 350, 40);
        panel.add(title);

        JButton adminBtn = new JButton("Admin");
        adminBtn.setBounds(260, 350, 250, 50);

        JButton userBtn = new JButton("User");
        userBtn.setBounds(260, 420, 250, 50);

        panel.add(adminBtn);
        panel.add(userBtn);
        add(panel);

        adminBtn.addActionListener(e -> {
            new AdminDashboardFrame();
            dispose();
        });

        setVisible(true);
    }
}

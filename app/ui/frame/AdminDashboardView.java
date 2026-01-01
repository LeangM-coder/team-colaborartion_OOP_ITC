package app.ui.frame;

import javax.swing.*;
import java.awt.*;

public class AdminDashboardView extends JFrame {

    public AdminDashboardView() {

        setTitle("Admin Dashboard");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel(null);
        panel.setBackground(Color.BLACK);

        // 🔙 Back Button
        JButton backBtn = new JButton("← Back");
        backBtn.setBounds(20, 20, 100, 35);
        backBtn.setFocusPainted(false);
        panel.add(backBtn);

        JLabel title = new JLabel("Cinema Admin Dashboard");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBounds(200, 120, 400, 40);
        panel.add(title);

        JButton hallBtn = new JButton("Hall Management");
        JButton movieBtn = new JButton("Movie & Pricing");

        styleButton(hallBtn);
        styleButton(movieBtn);

        hallBtn.setBounds(210, 260, 350, 55);
        movieBtn.setBounds(210, 340, 350, 55);

        panel.add(hallBtn);
        panel.add(movieBtn);

        add(panel);

        
        backBtn.addActionListener(e -> {
            new AdminDashboardFrame();
            dispose();
        });

        setVisible(true);
    }

    private void styleButton(JButton btn) {
        btn.setFont(new Font("Arial", Font.BOLD, 16));
        btn.setBackground(new Color(245, 201, 75));
        btn.setFocusPainted(false);
    }
}

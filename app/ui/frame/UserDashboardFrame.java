package app.ui.frame;

import javax.swing.*;
import java.awt.*;


public class UserDashboardFrame extends JFrame {

    public UserDashboardFrame() {
        setTitle("User Sign Up");
        setSize(1024, 768);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("User Sign Up", SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 24));

        add(label);
    }
}

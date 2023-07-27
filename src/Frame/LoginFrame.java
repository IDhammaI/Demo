package Frame;

import Service.CheckService;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginFrame extends JFrame {

    private JLabel loginLabel;
    private JLabel passwdLabel;
    private JTextField loginField;
    private JTextField passwdField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginFrame() {
        initFrame();
        initLabel();
        initListenner();
    }

    private void initListenner() {
        registerButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new RegisterFrame().setVisible(true);
            }
        });
        loginButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Username = loginField.getText().trim();
                String Password = passwdField.getText().trim();
                CheckService.checkLogin(Username, Password);

            }
        });
    }

    private void initLabel() {
        loginLabel = new JLabel("Username");
        loginLabel.setBounds(50, 50, 80, 25);
        add(loginLabel);

        passwdLabel = new JLabel("Password");
        passwdLabel.setBounds(50, 100, 80, 25);
        add(passwdLabel);

        loginField = new JTextField(16);
        loginField.setBounds(150, 50, 150, 25);
        add(loginField);

        passwdField = new JTextField(16);
        passwdField.setBounds(150, 100, 150, 25);
        add(passwdField);

        loginButton = new JButton("Login");
        loginButton.setBounds(80, 160, 100, 25);
        add(loginButton);

        registerButton = new JButton("Register");
        registerButton.setBounds(220, 160, 100, 25);
        add(registerButton);
    }

    private void initFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("Î¢ÐÅÁãÇ®Í¨Lite-ÇëµÇÂ¼");
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
    }
}
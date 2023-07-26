package Frame;


import javax.swing.*;

public class LoginFrame extends JFrame {

    private JLabel loginLabel;
    private JLabel passwdLabel;
    private JTextField loginField;
    private JTextField passwdField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("微信零钱通Lite");
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        // 确定组件位置和大小
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

}
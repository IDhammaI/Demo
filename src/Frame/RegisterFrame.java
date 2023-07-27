package Frame;

import javax.swing.*;

public class RegisterFrame extends JFrame {
    private JLabel loginLabel;
    private JLabel passwdLabel;
    private JTextField loginField;
    private JPasswordField passwdField;
    private JButton registerButton;

    public RegisterFrame() {
        initFrame();
        initLabel();
    }

    private void initLabel() {
        loginLabel = new JLabel("Username:");
        loginLabel.setBounds(50, 30, 80, 25);
        add(loginLabel);

        passwdLabel = new JLabel("Password:");
        passwdLabel.setBounds(50, 60, 80, 25);
        add(passwdLabel);

        loginField = new JTextField(16);
        loginField.setBounds(120, 30, 120, 25);
        add(loginField);

        passwdField = new JPasswordField(16);
        passwdField.setBounds(120, 60, 120, 25);
        add(passwdField);

        registerButton = new JButton("Register");
        registerButton.setBounds(100, 100, 100, 25);
        add(registerButton);
    }

    private void initFrame() {
        setSize(300, 200);
        setTitle("Çë×¢²á");
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
    }

}
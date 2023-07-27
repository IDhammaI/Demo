package Frame;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JLabel UsernameLabel;
    private JLabel moneyLabel;
    private String userName;
    private double balance;//TODO: use SQL

    public MainFrame(String Username) {
        userName = Username;
        initFrame();
        initLabel();
    }

    private void initLabel() {
        UsernameLabel = new JLabel("Username:" + userName);
        UsernameLabel.setBounds(20, 20, 80, 25);
        add(UsernameLabel);

        moneyLabel = new JLabel("Balance: " + balance);
        moneyLabel.setBounds(20, 50, 80, 25);
        add(moneyLabel);
    }

    private void initFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setTitle("微信零钱通Lite-主页面");
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
    }
}

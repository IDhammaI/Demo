package Service;

import Frame.MainFrame;
import javax.swing.*;

public class CheckService {
    public static int loginNum = 5;

    public static void checkLogin(String Username, String Password) {
        if (loginNum-- < 1) {
            JOptionPane.showMessageDialog(null, "��¼��������", "����", JOptionPane.ERROR_MESSAGE);
        } else if (Username.equals("1") && Password.equals("1")) {
            //TODO: use SQL
            JOptionPane.showMessageDialog(null, "��¼�ɹ�", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
            new MainFrame(Username).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "�˺Ż��������,ʣ�����:" + loginNum, "����", JOptionPane.ERROR_MESSAGE);
        }
    }
}

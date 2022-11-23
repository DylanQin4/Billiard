package windows;

import javax.swing.*;
import java.awt.*;

import objectDB.*;
import listeners.*;

public class PlayerFrame extends JFrame {
    JComboBox listPlayer1;
    JTextField newPlayer1;
    JComboBox listPlayer2;
    JTextField newPlayer2;
    JButton btnOk;

    public PlayerFrame()throws Exception{
        setTitle("Player");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        JLabel label1 = new JLabel("Select or add new player 1");
        listPlayer1 = new JComboBox(new CRUD().getNameAllPlayer());
        newPlayer1 = new JTextField();
        JLabel label2 = new JLabel("Select or add new player 2");
        listPlayer2 = new JComboBox(new CRUD().getNameAllPlayer());
        newPlayer2 = new JTextField();
        btnOk = new JButton("OK");
        btnOk.addMouseListener(new ListenerBtnPlayer(this));
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 200));
        panel.setLayout(new GridLayout(7, 1));
        panel.add(label1);
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 2));
        panel2.add(listPlayer1);
        panel2.add(newPlayer1);
        panel.add(panel2);
        panel.add(new JLabel());
        panel.add(label2);
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 2));
        panel3.add(listPlayer2);
        panel3.add(newPlayer2);
        panel.add(panel3);
        panel.add(new JLabel());
        panel.add(btnOk);
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    
    public JComboBox getListPlayer1() {
        return listPlayer1;
    }
    public void setListPlayer1(JComboBox listPlayer1) {
        this.listPlayer1 = listPlayer1;
    }
    public JTextField getNewPlayer1() {
        return newPlayer1;
    }
    public void setNewPlayer1(JTextField newPlayer1) {
        this.newPlayer1 = newPlayer1;
    }
    public JComboBox getListPlayer2() {
        return listPlayer2;
    }
    public void setListPlayer2(JComboBox listPlayer2) {
        this.listPlayer2 = listPlayer2;
    }
    public JTextField getNewPlayer2() {
        return newPlayer2;
    }
    public void setNewPlayer2(JTextField newPlayer2) {
        this.newPlayer2 = newPlayer2;
    }
    public JButton getBtnOk() {
        return btnOk;
    }
    public void setBtnOk(JButton btnOk) {
        this.btnOk = btnOk;
    }
}

package listeners;

import java.awt.event.*;

import javax.swing.*;

import objectDB.CRUD;
import windows.GameFrame;
import windows.PlayerFrame;

public class ListenerBtnPlayer implements MouseListener{
    PlayerFrame playerFrame;
    JComboBox listPlayer1;
    JTextField newPlayer1;
    JComboBox listPlayer2;
    JTextField newPlayer2;
    JButton btnOk;

    public ListenerBtnPlayer(PlayerFrame playerFrame){
        setPlayerFrame(playerFrame);
        setListPlayer1(playerFrame.getListPlayer1());
        setNewPlayer1(playerFrame.getNewPlayer1());
        setListPlayer2(playerFrame.getListPlayer2());
        setNewPlayer2(playerFrame.getNewPlayer2());
        setBtnOk(playerFrame.getBtnOk());
    }

    public void mouseClicked(MouseEvent e) {
        try {
            String namePlayer1 = (String)listPlayer1.getSelectedItem();
            String namePlayer2 = (String)listPlayer2.getSelectedItem();
            String[] namePlayers = new String[2];
            if (newPlayer1.getText().compareTo("") != 0) {
                namePlayer1 = newPlayer1.getText();
            }
            if (newPlayer2.getText().compareTo("") != 0) {
                namePlayer2 = newPlayer2.getText();
            }
            System.out.println(namePlayer1+" "+namePlayer2);
            if (namePlayer1.compareTo(namePlayer2) == 0) {
                System.out.println("tsy mety");
            } else {
                playerFrame.setVisible(false);
                // CRUD crud = new CRUD()
                namePlayers[0] = namePlayer1;
                namePlayers[1] = namePlayer2;
                GameFrame gameFrame = new GameFrame();
            }
            if (newPlayer1.getText().compareTo("") != 0) {
                new CRUD().insertPlayer(namePlayer1);
            }
            if (newPlayer2.getText().compareTo("") != 0) {
                new CRUD().insertPlayer(namePlayer2);
            }
            // playerFrame.getTable().setNamePlayers(namePlayers);
        } catch (Exception ex) {
        }
    }
    public void mouseEntered(MouseEvent e) {
    }
    public void mouseExited(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }

    

    public PlayerFrame getPlayerFrame() {
        return playerFrame;
    }

    public void setPlayerFrame(PlayerFrame playerFrame) {
        this.playerFrame = playerFrame;
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

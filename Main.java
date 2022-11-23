package run;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.util.Timer;
import materials.*;
import windows.*;

public class Main {
    public static void main(String[] args) {
        JFrame playerFrame = new JFrame();
        try {
            playerFrame = new PlayerFrame();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(playerFrame, e.getMessage(), "Error", 0);
        }
    }
    
}
package windows;

import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import java.awt.*;
import materials.*;
import listeners.*;

public class GameFrame extends JFrame {

    public GameFrame()throws Exception{
        setTitle("Billiard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(1, 2));
        Table table = new Table(6);
        table.addMouseListener(new ListenerTable(table));
        add(table);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

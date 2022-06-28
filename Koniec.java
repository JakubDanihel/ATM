import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JFrame;
import javax.swing.JCheckBox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Koniec {
    JTextField textField = new JTextField();
    JFrame frame = new JFrame();

    Koniec(){
        frame.setTitle("Bankovky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        textField.setBounds(32, 32, 448, 448);
        textField.setFocusable(false);
        textField.setText("Peniaze vydane.");
        textField.setFont(new Font(null, Font.ITALIC, 40));

        frame.add(textField);
    }
}

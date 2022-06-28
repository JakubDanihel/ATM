import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Potvrdenie_vklad implements ActionListener{
    JFrame frame = new JFrame();
    
    JLabel zostatokLabel = new JLabel("Novy zostatok: ");

    JTextArea zostatok_area = new JTextArea();

    JButton menuButton = new JButton("Menu");
    JButton koniecButton = new JButton("Koniec");

    Double money;
    Double vklad;
    Double novy_zostatok;


    Potvrdenie_vklad(Double pridavok, Double zostatok){
        vklad=pridavok;
        money = zostatok;
        novy_zostatok=money+vklad;

        frame.setTitle("Vklad potvrdenie");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //label
        zostatokLabel.setBounds(128, 128, 120, 32);
        zostatokLabel.setFocusable(false);

        zostatok_area.setBounds(128, 160, 120, 32);
        zostatok_area.setFocusable(false);
        zostatok_area.setText(novy_zostatok+" €");

        //tlacidla
        menuButton.setBounds(64, 384, 100, 50);
        menuButton.setFocusable(false);
        menuButton.addActionListener(this);

        koniecButton.setBounds(320, 384, 100, 50);
        koniecButton.setFocusable(false);
        koniecButton.addActionListener(this);


        frame.add(zostatokLabel);
        frame.add(zostatok_area);
        frame.add(menuButton);
        frame.add(koniecButton);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == menuButton){
            frame.dispose();
            Main_Menu menu = new Main_Menu(money+vklad);
        }
        if(e.getSource() == koniecButton){
            frame.dispose();
        }
        
    }
}

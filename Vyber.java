import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Vyber implements ActionListener{
    JFrame frame = new JFrame();

    JButton vyberButton = new JButton("Vyber");
    JButton spatButton = new JButton("Spat");

    JLabel sumaLabel = new JLabel("Zadaj sumu");
    JTextField  sumaField = new JTextField();

    JTextArea nedostatok = new JTextArea();

    
    Double money;
    Double suma;
    Double zvysok;

    Vyber(Double peniaze)
    {
        frame.setTitle("Vyber");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        money = peniaze;

        //suma na vyber
        sumaLabel.setBounds(125, 75, 250, 50);
        sumaField.setBounds(125, 125, 250, 50);
        sumaField.setFont(new Font("Ink Free", Font.BOLD, 30));

        //tlacidla
        vyberButton.setBounds(0,375, 125, 125);
        vyberButton.setFocusable(false);
        vyberButton.addActionListener(this);

        spatButton.setBounds(375, 375, 125, 125);
        spatButton.setFocusable(false);
        spatButton.addActionListener(this);

        //nedostaok
        nedostatok.setFont(new Font("Ink Free", Font.BOLD, 20));
        nedostatok.setBounds(125, 175, 250, 200);


        //zobrazenie
        frame.add(sumaLabel);
        frame.add(sumaField);
        frame.add(vyberButton);
        frame.add(spatButton);
        frame.add(nedostatok);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vyberButton){
            suma = Double.parseDouble(sumaField.getText());
            
            //kontrola ci suma je mensia ako zostatok na ucte
            if((money-suma)<=0){
                nedostatok.setText("Nedostatok na ucte");
                nedostatok.setForeground(Color.red);
            }
            if((suma%5) != 0){
                nedostatok.setText("Zle zady pocet");
                nedostatok.setForeground(Color.ORANGE);
                }
            if(suma>1000000){
                nedostatok.setText("Suma presahuje limit\n 1 000 000.\n Zvol mensiu sumu.");
                
                nedostatok.setForeground(Color.ORANGE);
                sumaField.setText("");
            }
            else{
                frame.dispose();
                nedostatok.setText("");
                Bankovky bankovky = new Bankovky(suma);
            }
        }

        if(e.getSource() == spatButton)
        {
            frame.dispose();
            Main_Menu mainMenu = new Main_Menu(money);
        }
    }
}

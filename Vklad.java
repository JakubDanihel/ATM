import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Vklad implements ActionListener{
    
    JFrame frame = new JFrame();

    //label pre texty
    JLabel vkladLabel = new JLabel("Vklad: ");
    JLabel novyZostatokLabel = new JLabel("Zostatok:");
    
    //area pre texty
    JTextArea sumaArea = new JTextArea();
    JTextArea zostatokArea = new JTextArea();
    JTextArea novyZostatokArea = new JTextArea();
    JTextArea neuspesnyVklad_Area = new JTextArea();

    //tlacidla
    JButton potvrdenieButton = new JButton("Potvrdenie");
    JButton spatButton = new JButton("Spat");
    JButton resetButton = new JButton("Reset");
    JButton koniecButton = new JButton("Koniec");

    Double peniaze=0.0;
    Double vklad_suma;
    Double zostatok=0.0;

    Vklad(Double money){
        peniaze = money;

        frame.setTitle("Vklad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //vlozenie titulov
        vkladLabel.setBounds(32, 32, 64, 32);
        vkladLabel.setFocusable(false);

        novyZostatokLabel.setBounds(32, 224, 128, 32);
        novyZostatokLabel.setFocusable(false);

        //tlacidla
        potvrdenieButton.setBounds(32, 384, 100, 32);
        potvrdenieButton.setFocusable(false);
        potvrdenieButton.addActionListener(this);

        spatButton.setBounds(150,384, 100, 32);
        spatButton.setFocusable(false);
        spatButton.addActionListener(this);

        resetButton.setBounds(270, 384, 100, 32);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        koniecButton.setBounds(390, 384, 100, 32);
        koniecButton.setFocusable(false);
        koniecButton.addActionListener(this);

        //polia
        sumaArea.setBounds(32, 64, 256, 32);

        
        novyZostatokArea.setBounds(32, 258, 256, 32);
        novyZostatokArea.setText(money+" €");
        novyZostatokArea.setFocusable(false);

        neuspesnyVklad_Area.setBounds(256, 160, 128, 32);
        neuspesnyVklad_Area.setFocusable(false);


        //vykreslenie obrazov
        //label
        frame.add(vkladLabel);
        frame.add(novyZostatokLabel);
        //tlacidla
        frame.add(potvrdenieButton);
        frame.add(spatButton);
        frame.add(resetButton);
        frame.add(koniecButton);
        //polia
        frame.add(sumaArea);
        frame.add(novyZostatokArea);
        frame.add(neuspesnyVklad_Area);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == potvrdenieButton){
            vklad_suma = Double.parseDouble(sumaArea.getText());

            if((vklad_suma%5)!=0){

                neuspesnyVklad_Area.setText("Nespravny format vkladu. \nMusi byt delitelne 5.");
                neuspesnyVklad_Area.setForeground(Color.RED);
                sumaArea.setText("");
            }
            if((vklad_suma%5) == 0){
                frame.dispose();
                Potvrdenie_vklad potvrdenievklad = new Potvrdenie_vklad(vklad_suma, peniaze);
            }

        }

        if(e.getSource() == spatButton){
            frame.dispose();
            Main_Menu menu = new Main_Menu(peniaze);
        }

        if(e.getSource() == resetButton){
            sumaArea.setText("");
        }
        
        if(e.getSource() == koniecButton){
            frame.dispose();
        }
    }
}

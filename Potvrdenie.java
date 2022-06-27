import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JFrame;
import javax.swing.JCheckBox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Potvrdenie implements ActionListener{
    JFrame frame = new JFrame();
    JButton potvrdenieButton = new JButton("Vyber");
    JButton spatButton = new JButton("Spat");
    JButton koniecButton = new JButton("Koniec");

    JTextField suma_Field = new JTextField();

    JLabel suma_Label = new JLabel("Suma: ");

    JLabel bankovky_Label = new JLabel("Bankovky: ");

    //bankovky
    JTextField pocet5E_Field = new JTextField();
    JTextArea pocet5E_Label = new JTextArea("Pocet 5€ bankoviek");
    
    JTextField pocet10E_Field = new JTextField();
    JTextArea pocet10E_Label = new JTextArea("Pocet 10€ bankoviek a pocet 5€");
    
    JTextField pocet20E_Field = new JTextField();
    JTextArea pocet20E_Label = new JTextArea("Pocet 20€ bankoviek a pocet 10€ a 5€");
    
    JTextField pocet50E_Field = new JTextField();
    JTextArea pocet50E_Label = new JTextArea("Pocet 50€ bankoviek a pocet 20€, \n10€, 5€");
    
    JTextField pocet100E_Field = new JTextField();
    JTextArea pocet100E_Label = new JTextArea("Pocet 100€ bankoviek a pocet 50€, 20€, 10€, 5€");
    
    JTextField pocet200E_Field = new JTextField();
    JTextArea pocet200E_Label = new JTextArea("Pocet 200€ bankoviek a pocet 100€, 50€, 20€, 10€, 5€");
    
    JTextArea pocet500E_Label = new JTextArea("Pocet 500€ bankoviek a pocet 200€, 100€, 50€, 20€, 10€, 5€");
    JTextArea pocet500E_Field = new JTextArea();

    Double suma;
    int bankovky;

    Double pocet5 = 0.0;
    Double pocet10 = 0.0;
    Double pocet20 = 0.0;
    Double pocet50 = 0.0;
    Double pocet100 = 0.0;
    Double pocet200 = 0.0;
    Double pocet500 = 0.0;

    Potvrdenie(Double vyber, int pocet){
        suma = vyber;
        bankovky = pocet;
        
        frame.setTitle("Potvrdenie vyberu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //tlacidla
        potvrdenieButton.setBounds(30, 368, 80, 50);
        potvrdenieButton.setFocusable(false);
        potvrdenieButton.addActionListener(this);

        spatButton.setBounds(150, 368, 80, 50);
        spatButton.setFocusable(false);
        spatButton.addActionListener(this);

        koniecButton.setBounds(250, 368, 80, 50);
        koniecButton.setFocusable(false);
        koniecButton.addActionListener(this);

        suma_Field.setBounds(120, 32, 200, 30);
        suma_Field.setFocusable(false);
        suma_Field.setText(String.valueOf(suma));
        suma_Field.setFocusable(false);

        suma_Label.setBounds(32, 32, 80, 40);

        bankovky_Label.setBounds(32, 64, 64, 50);
        

        //okna
        //nastevenie zobrazenia poli s textom pre bankovky a sumou
        if (pocet == 5){
            pocet5 = suma/5;

            pocet5E_Label.setBounds(100, 64, 200, 64);
            pocet5E_Label.setLineWrap(true);
            pocet5E_Label.setFocusable(false);

            pocet5E_Field.setBounds(100, 130, 200, 30);
            pocet5E_Field.setFocusable(false);
            pocet5E_Field.setText(pocet5+"ks");

            frame.add(pocet5E_Label);
            frame.add(pocet5E_Field);
        }

        if (pocet == 10){
            pocet10 = Math.floor(suma/10);

            pocet10E_Label.setBounds(100, 64, 200, 64);
            pocet10E_Label.setLineWrap(true);
            pocet10E_Label.setFocusable(false);

            pocet10E_Field.setBounds(100, 130, 200, 30);
            pocet10E_Field.setFocusable(false);

            pocet10E_Field.setText(pocet10+"ks "+(suma-(pocet10*10))/5+"ks");

            frame.add(pocet10E_Label);
            frame.add(pocet10E_Field);
        }

        if (pocet == 20){
            pocet20 = Math.floor(suma/20);

            pocet20E_Label.setBounds(100, 64, 200, 64);
            pocet20E_Label.setLineWrap(true);
            pocet20E_Label.setFocusable(false);

            pocet20E_Field.setBounds(100, 130, 200, 30);
            pocet20E_Field.setFocusable(false);

            pocet20E_Field.setText(pocet20+"ks "+Math.floor(((suma-(pocet20*20))/10))+"ks "+((((suma-(pocet20*20))/10)-Math.floor(((suma-(pocet20*20))/10)))*10)/5+"ks");

            frame.add(pocet20E_Label);
            frame.add(pocet20E_Field);
        }

        if (pocet == 50){
            pocet50 = Math.floor(suma/50);

            pocet50E_Label.setBounds(100, 64, 200, 64);
            pocet50E_Label.setLineWrap(true);
            pocet50E_Label.setFocusable(false);

            pocet50E_Field.setBounds(100, 130, 200, 30);
            pocet50E_Field.setFocusable(false);

            pocet50E_Field.setText(pocet50+"ks "+Math.floor(((suma-(pocet50*50))/20))+"ks "+Math.floor(((suma-(pocet50*50))-Math.floor(((suma-(pocet50*50))/20))*20)/10)+"ks "+(((((suma-(pocet50*50))-Math.floor(((suma-(pocet50*50))/20))*20)/10)-Math.floor(((suma-(pocet50*50))-Math.floor(((suma-(pocet50*50))/20))*20)/10))*10)/5+"ks");

            frame.add(pocet50E_Label);
            frame.add(pocet50E_Field);
        }

        if (pocet == 100){
            pocet100 = Math.floor(suma/100);

            pocet10E_Label.setBounds(100, 64, 200, 64);
            pocet100E_Label.setLineWrap(true);
            pocet100E_Label.setFocusable(false);

            pocet100E_Field.setBounds(100, 130, 200, 30);
            pocet100E_Field.setFocusable(false);

            pocet100E_Field.setText(pocet100+"ks "+Math.floor((suma-pocet100*100)/50)+"ks "+Math.floor(((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20)+"ks "+Math.floor((((((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20)-Math.floor(((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20))*20)/10)+"ks "+Math.floor(((((((((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20)-Math.floor(((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20))*20)/10)-Math.floor((((((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20)-Math.floor(((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20))*20)/10))*10)/5)+"ks");

            frame.add(pocet100E_Label);
            frame.add(pocet100E_Field);
        }

        if (pocet == 200){
            pocet200 = Math.floor(suma/200);

            pocet200E_Label.setBounds(100, 64, 200, 64);
            pocet200E_Label.setLineWrap(true);
            pocet200E_Label.setFocusable(false);

            pocet200E_Field.setBounds(100, 130, 200, 30);
            pocet200E_Field.setFocusable(false);
            pocet200E_Field.setText(pocet200+"ks "+Math.floor((suma-(pocet200*200))/100)+"ks "+Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)+"ks "+Math.floor((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20)+"ks "+Math.floor(((((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20)-Math.floor((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20))*20)/10)+"ks "+Math.floor((((((((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20)-Math.floor((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20))*20)/10)-Math.floor(((((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20)-Math.floor((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20))*20)/10))*10)/5)+"ks");

            frame.add(pocet200E_Label);
            frame.add(pocet200E_Field);
        }

        if (pocet == 500){
            pocet500 = Math.floor(suma/500);

            pocet500E_Label.setBounds(100, 64, 200, 64);
            pocet500E_Label.setLineWrap(true);
            pocet500E_Label.setFocusable(false);

            pocet500E_Field.setBounds(100, 130, 200, 30);
            pocet500E_Field.setFocusable(false);
            
            pocet500E_Field.setText(pocet500+"ks "+Math.floor((suma-(pocet500*500))/200)+"ks "+Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100)+"ks "+Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)+"ks "+"\n"+Math.floor((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20)+"ks "+Math.floor(((((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20)-Math.floor((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20))*20)/10)+"ks "+Math.floor((((((((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20)-Math.floor((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20))*20)/10)-Math.floor(((((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20)-Math.floor((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20))*20)/10))*10)/5)+"ks ");

            frame.add(pocet500E_Label);
            frame.add(pocet500E_Field);
        }

        frame.add(potvrdenieButton);
        frame.add(spatButton);
        frame.add(koniecButton);
        frame.add(suma_Label);
        frame.add(suma_Field);
        frame.add(bankovky_Label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == spatButton);
        {
            Bankovky bankovky = new Bankovky(suma);
            frame.dispose();
        }

        if(e.getSource() == koniecButton)
        {
            frame.dispose();
        }

        if(e.getSource() == potvrdenieButton)
        {
            Vydaj vydaj = new Vydaj(suma, bankovky);
            frame.dispose();
        }
        
    }
}

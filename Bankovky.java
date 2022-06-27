import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JFrame;
import javax.swing.JCheckBox;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Bankovky extends JFrame implements ActionListener, ItemListener{

    JFrame frame = new JFrame();
    JButton vyberButton = new JButton("Vyber");
    JButton spatButton = new JButton("Spat");

    JButton nulak_Button = new JButton("Vynulovat");

    JTextField suma_Field = new JTextField();

    JLabel suma_Label = new JLabel("Suma: ");

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

    Double vyber;
    Double pocet5 = 0.0;
    Double pocet10 = 0.0;
    Double pocet20 = 0.0;
    Double pocet50 = 0.0;
    Double pocet100 = 0.0;
    Double pocet200 = 0.0;
    Double pocet500 = 0.0;

    //checkbox
    JCheckBox p5E_box = new JCheckBox();
    JCheckBox p10E_box = new JCheckBox();
    JCheckBox p20E_box = new JCheckBox();
    JCheckBox p50E_box = new JCheckBox();
    JCheckBox p100E_box = new JCheckBox();
    JCheckBox p200E_box = new JCheckBox();
    JCheckBox p500E_box = new JCheckBox(); 

    //prazdny label
    final Label label = new Label();


    Bankovky(Double peniaz){
        vyber = peniaz;


        frame.setTitle("Bankovky");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //tlacidla
        vyberButton.setBounds(280, 20, 80, 50);
        vyberButton.setFocusable(false);
        vyberButton.addActionListener(this);

        spatButton.setBounds(380, 20, 80, 50);
        spatButton.setFocusable(false);
        spatButton.addActionListener(this);

        nulak_Button.setBounds(280, 340, 100, 50);
        nulak_Button.setFocusable(false);
        nulak_Button.addActionListener(this);        

        //suma
        suma_Label.setBounds(30, 10, 100,60);
        //suma_Label.setFont(new Font(null, Font.ITALIC, 25));

        suma_Field.setBounds(30, 70, 200, 50);
        suma_Field.setText(String.valueOf(peniaz));
        suma_Field.setFocusable(false);

        //labes a fields
        //5e
        pocet5E_Label.setBounds(30, 125, 200, 30);
        pocet5E_Label.setLineWrap(true);
        pocet5E_Label.setFocusable(false);
        pocet5E_Field.setBounds(30, 160, 200, 30);
        pocet5E_Field.setFocusable(false);

        //10e
        pocet10E_Label.setBounds(30, 195, 200, 30);
        pocet10E_Label.setLineWrap(true);
        pocet10E_Label.setFocusable(false);
        pocet10E_Field.setBounds(30, 225, 200, 30);
        pocet10E_Field.setFocusable(false);

        //20e
        pocet20E_Label.setBounds(30, 260, 200, 40);
        pocet20E_Label.setLineWrap(true);
        pocet20E_Label.setFocusable(false);
        pocet20E_Field.setBounds(30, 305, 200, 30);
        pocet20E_Field.setFocusable(false);

        //50e
        pocet50E_Label.setBounds(30, 340, 200, 40);
        pocet50E_Label.setLineWrap(true);
        pocet50E_Label.setFocusable(false);
        pocet50E_Field.setBounds(30, 385, 200, 30);
        pocet50E_Field.setFocusable(false);

        //100e
        pocet100E_Label.setBounds(280, 80, 200, 40);
        pocet100E_Label.setLineWrap(true);
        pocet100E_Label.setFocusable(false);
        pocet100E_Field.setBounds(280, 125, 200, 30);
        pocet100E_Field.setFocusable(false);

        //200e
        pocet200E_Label.setBounds(280, 160, 200, 40);
        pocet200E_Label.setLineWrap(true);
        pocet200E_Label.setFocusable(false);
        pocet200E_Field.setBounds(280, 205, 200, 30);
        pocet200E_Field.setFocusable(false);

        //500
        pocet500E_Label.setBounds(280, 240, 200, 40);
        pocet500E_Label.setLineWrap(true);
        pocet500E_Label.setFocusable(false);
        pocet500E_Field.setBounds(280, 285, 200, 60);
        pocet500E_Field.setFocusable(false);

        //check box
        p5E_box.setBounds(5, 125, 20, 20);
        p5E_box.addItemListener(this);
        p10E_box.setBounds(5, 195, 20, 20);
        p10E_box.addItemListener(this);
        p20E_box.setBounds(5, 260, 20, 20);
        p20E_box.addItemListener(this);
        p50E_box.setBounds(5, 340, 20, 20);
        p50E_box.addItemListener(this);
        p100E_box.setBounds(250, 80, 20, 20);
        p100E_box.addItemListener(this);
        p200E_box.setBounds(250, 160, 20, 20);
        p200E_box.addItemListener(this);
        p500E_box.setBounds(250, 240, 20, 20);
        p500E_box.addItemListener(this);

        //vykreslenie
        frame.add(vyberButton);
        frame.add(spatButton);
        frame.add(suma_Label);
        frame.add(suma_Field);

        frame.add(pocet5E_Field);
        frame.add(pocet5E_Label);

        frame.add(pocet10E_Field);
        frame.add(pocet10E_Label);

        frame.add(pocet20E_Field);
        frame.add(pocet20E_Label);

        frame.add(pocet50E_Field);
        frame.add(pocet50E_Label);

        frame.add(pocet100E_Field);
        frame.add(pocet100E_Label);

        frame.add(pocet200E_Field);
        frame.add(pocet200E_Label);

        frame.add(pocet500E_Field);
        frame.add(pocet500E_Label);

        frame.add(nulak_Button);

        frame.add(p5E_box);
        frame.add(p10E_box);
        frame.add(p20E_box);
        frame.add(p50E_box);
        frame.add(p100E_box);
        frame.add(p200E_box);
        frame.add(p500E_box);

        pocet(vyber);
    }

    //pocet bankoviek
    void pocet(Double suma){
        pocet5 = suma/5;
        pocet10 = Math.floor(suma/10);
        pocet20 = Math.floor(suma/20);
        pocet50 = Math.floor(suma/50);
        pocet100 = Math.floor(suma/100);
        pocet200 = Math.floor(suma/200);
        pocet500 = Math.floor(suma/500);

        //pocet 5e bakoviek
        pocet5E_Field.setText(pocet5+"ks");

        //pocet 10e banoviek
        pocet10E_Field.setText(pocet10+"ks "+(suma-(pocet10*10))/5+"ks");

        //pocet 20e banoviek
        pocet20E_Field.setText(pocet20+"ks "+Math.floor(((suma-(pocet20*20))/10))+"ks "+((((suma-(pocet20*20))/10)-Math.floor(((suma-(pocet20*20))/10)))*10)/5+"ks");

        //pocet 50e bankoviek
        pocet50E_Field.setText(pocet50+"ks "+Math.floor(((suma-(pocet50*50))/20))+"ks "+Math.floor(((suma-(pocet50*50))-Math.floor(((suma-(pocet50*50))/20))*20)/10)+"ks "+(((((suma-(pocet50*50))-Math.floor(((suma-(pocet50*50))/20))*20)/10)-Math.floor(((suma-(pocet50*50))-Math.floor(((suma-(pocet50*50))/20))*20)/10))*10)/5+"ks");

        //pocet 100e bankoviek
        pocet100E_Field.setText(pocet100+"ks "+Math.floor((suma-pocet100*100)/50)+"ks "+Math.floor(((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20)+"ks "+Math.floor((((((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20)-Math.floor(((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20))*20)/10)+"ks "+Math.floor(((((((((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20)-Math.floor(((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20))*20)/10)-Math.floor((((((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20)-Math.floor(((suma-(pocet100*100))-Math.floor(((suma-(pocet100*100))/50))*50)/20))*20)/10))*10)/5)+"ks");

        //pocet 200e bankoviek
        pocet200E_Field.setText(pocet200+"ks "+Math.floor((suma-(pocet200*200))/100)+"ks "+Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)+"ks "+Math.floor((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20)+"ks "+Math.floor(((((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20)-Math.floor((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20))*20)/10)+"ks "+Math.floor((((((((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20)-Math.floor((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20))*20)/10)-Math.floor(((((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20)-Math.floor((((((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50)-Math.floor(((((suma-(pocet200*200))/100)-Math.floor((suma-(pocet200*200))/100))*100)/50))*50)/20))*20)/10))*10)/5)+"ks");

        //pocet 500e banoviek
        pocet500E_Field.setText(pocet500+"ks "+Math.floor((suma-(pocet500*500))/200)+"ks "+Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100)+"ks "+Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)+"ks "+"\n"+Math.floor((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20)+"ks "+Math.floor(((((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20)-Math.floor((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20))*20)/10)+"ks "+Math.floor((((((((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20)-Math.floor((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20))*20)/10)-Math.floor(((((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20)-Math.floor((((((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50)-Math.floor(((((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100-Math.floor(((((suma-(pocet500*500))/200)-Math.floor((suma-(pocet500*500))/200))*200)/100))*100)/50))*50)/20))*20)/10))*10)/5)+"ks ");
    }

    public void itemStateChanged(ItemEvent e){
        if(p5E_box.isSelected()){
            p10E_box.setSelected(false);
            p20E_box.setSelected(false);
            p50E_box.setSelected(false);
            p100E_box.setSelected(false);
            p200E_box.setSelected(false);
            p500E_box.setSelected(false);

        } else if(p10E_box.isSelected()){
            p5E_box.setSelected(false);
            p20E_box.setSelected(false);
            p50E_box.setSelected(false);
            p100E_box.setSelected(false);
            p200E_box.setSelected(false);
            p500E_box.setSelected(false);

        } else if(p20E_box.isSelected()){
            p10E_box.setSelected(false);
            p5E_box.setSelected(false);
            p50E_box.setSelected(false);
            p100E_box.setSelected(false);
            p200E_box.setSelected(false);
            p500E_box.setSelected(false);

        } else if(p50E_box.isSelected()){
            p10E_box.setSelected(false);
            p20E_box.setSelected(false);
            p5E_box.setSelected(false);
            p100E_box.setSelected(false);
            p200E_box.setSelected(false);
            p500E_box.setSelected(false);

        } else if(p100E_box.isSelected()){
            p10E_box.setSelected(false);
            p20E_box.setSelected(false);
            p50E_box.setSelected(false);
            p5E_box.setSelected(false);
            p200E_box.setSelected(false);
            p500E_box.setSelected(false);

        } else if(p200E_box.isSelected()){
            p10E_box.setSelected(false);
            p20E_box.setSelected(false);
            p50E_box.setSelected(false);
            p100E_box.setSelected(false);
            p5E_box.setSelected(false);
            p500E_box.setSelected(false);

        } else if(p500E_box.isSelected()){
            p10E_box.setSelected(false);
            p20E_box.setSelected(false);
            p50E_box.setSelected(false);
            p100E_box.setSelected(false);
            p200E_box.setSelected(false);
            p5E_box.setSelected(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vyberButton){
            frame.dispose();
            if(p5E_box.isSelected() == true){
                frame.dispose();
                Potvrdenie potvrdenie = new Potvrdenie(vyber, 5);
                frame.dispose();
            }

            if(p10E_box.isSelected() == true){
                frame.dispose();
                Potvrdenie potvrdenie = new Potvrdenie(vyber, 10);
                frame.dispose();
            }

            if(p20E_box.isSelected() == true){
                frame.dispose();
                Potvrdenie potvrdenie = new Potvrdenie(vyber, 20);
                frame.dispose();
            }

            if(p50E_box.isSelected() == true){
                frame.dispose();
                Potvrdenie potvrdenie = new Potvrdenie(vyber, 50);
                frame.dispose();
            }

            if(p100E_box.isSelected() == true){
                frame.dispose();
                Potvrdenie potvrdenie = new Potvrdenie(vyber, 100);
                frame.dispose();
            }

            if(p200E_box.isSelected() == true){
                frame.dispose();
                Potvrdenie potvrdenie = new Potvrdenie(vyber, 200);
                frame.dispose();
            }

            if(p500E_box.isSelected() == true){
                frame.dispose();
                Potvrdenie potvrdenie = new Potvrdenie(vyber, 500);
                frame.dispose();
            }
        }

        if(e.getSource() == spatButton){
            frame.dispose();
            Vyber bubaky = new Vyber(vyber);
        }

        if(e.getSource() == nulak_Button){
            p10E_box.setSelected(false);
            p20E_box.setSelected(false);
            p50E_box.setSelected(false);
            p100E_box.setSelected(false);
            p200E_box.setSelected(false);
            p500E_box.setSelected(false);
            p5E_box.setSelected(false);
        }
        
        frame.dispose();
    } 
    
}

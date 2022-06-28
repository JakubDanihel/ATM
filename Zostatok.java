import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class Zostatok implements ActionListener{
    JFrame frame =new JFrame();

    JButton spatButton = new JButton("Spat");
    JButton koniecButton = new JButton("Koniec");

    JTextArea zostatokArea = new JTextArea();
    JLabel zostatok_Label = new JLabel("Zostatok: ");


    Double money;

    Zostatok(Double peniaze){
        money = peniaze;

        frame.setTitle("Zostatok");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(512, 512);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //tlacidla
        spatButton.setBounds(64, 384, 80, 60);
        spatButton.setFocusable(false);
        spatButton.addActionListener(this);

        koniecButton.setBounds(200, 384, 80, 60);
        koniecButton.setFocusable(false);
        koniecButton.addActionListener(this);

        //pole so zostatkom
        zostatok_Label.setBounds(64,64,189,64);
        zostatok_Label.setFocusable(false);

        zostatokArea.setBounds(64, 128, 189, 64);
        zostatokArea.setFocusable(false);
        zostatokArea.setFont(new Font(null, Font.ITALIC, 30));
        zostatokArea.setText(money+" €");
    


        frame.add(spatButton);
        frame.add(koniecButton);
        frame.add(zostatok_Label);
        frame.add(zostatokArea);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == spatButton){
            frame.dispose();
            Main_Menu mainmenu = new Main_Menu(money);

        }

        if(e.getSource() == koniecButton){
            frame.dispose();
        }
        
    }
}

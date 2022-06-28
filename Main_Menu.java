import javax.swing.JFrame;

import javax.swing.*;
import java.awt.event.*;


public class Main_Menu implements ActionListener{
        
    JFrame frame = new JFrame();
    JLabel mainMenu = new JLabel();

    JButton vyberButton = new JButton("Vyber");
    JButton vkladButton = new JButton("Vklad");
    JButton zostatokButton = new JButton("Zostatok");
    JButton koniecButton = new JButton("Koniec");
    Double peniaze;

    Main_Menu(Double money)
    {
        peniaze = money;

        //nastavenie okna
        frame.setTitle("Menu");
        //mainMenu.setBounds(0, 0, 200,35);
        //mainMenu.setFont(new Font(null, Font.PLAIN, 25));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //tlacidla
        //vyber
        vyberButton.setBounds(50, 50, 100, 100);
        vyberButton.setFocusable(false);
        vyberButton.addActionListener(this);

        //Vklad
        vkladButton.setBounds(50, 250, 100, 100);
        vkladButton.setFocusable(false);
        vkladButton.addActionListener(this);

        //zostatok
        zostatokButton.setBounds(250, 50, 100, 100);
        zostatokButton.setFocusable(false);
        zostatokButton.addActionListener(this);

        //koniec
        koniecButton.setBounds(250, 250, 100, 100);
        koniecButton.setFocusable(false);
        koniecButton.addActionListener(this);


        //System.out.println(peniaze);

        //vykreslenie
        frame.add(mainMenu);
        frame.add(vyberButton);
        frame.add(vkladButton);
        frame.add(zostatokButton);
        frame.add(koniecButton);


    }

    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == vyberButton)
        {
            frame.dispose();
            Vyber vyber = new Vyber(peniaze);
            
        }
        if(e.getSource() == vkladButton){
            frame.dispose();
            Vklad vklad = new Vklad(peniaze);

        }

        if(e.getSource() == zostatokButton)
        {
            frame.dispose();
            Zostatok zostatok = new Zostatok(peniaze);
        }

        if(e.getSource() == koniecButton)
        {
            frame.dispose();
        }
        
    }
}

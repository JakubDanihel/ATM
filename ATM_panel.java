import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;


public class ATM_panel implements ActionListener{
    JFrame frame = new JFrame();

    //velkost okna
    static final int SCREEN_WIDTH = 500;
    static final int SCREEN_HEIGHT = 500;

    //tlacidla
    JButton loginButton = new JButton("Log In");
    JButton resetButton = new JButton("reset");

    //pin
    JPasswordField pin = new JPasswordField();
    JLabel pin_ID = new JLabel("heslo");

    /*=========================================== */

    JLabel spravaLabel = new JLabel();
    HashMap<Integer, Double> loginInfo = new HashMap<Integer, Double>();

    ATM_panel(HashMap<Integer, Double> loginInforOriginal){
        loginInfo = loginInforOriginal;

        //nastavenie okna
        frame.setTitle("ATM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        //pin pole a text
        pin_ID.setBounds(50, 100, 75, 25);
        pin.setBounds(125, 100, 200, 25);

        //tlacidla
        loginButton.setBounds(125, 150, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 150, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        //sprava
        spravaLabel.setBounds(125, 250, 250, 35);
        spravaLabel.setFont(new Font(null, Font.ITALIC, 25));


        //zobrazenie
        frame.add(pin_ID);
        frame.add(pin);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(spravaLabel);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton)
        {
            
            String user_PIN = String.valueOf(pin.getPassword());
            //System.out.println(user_PIN);
            
            if(loginInfo.containsKey(user_PIN))
            {
                spravaLabel.setForeground(Color.green);
                spravaLabel.setText("spravne heslo");
                Double money = loginInfo.get(user_PIN);

                //nove okno s menu
                frame.dispose();
                Main_Menu menu = new Main_Menu(money);
                
            }
            else{
                spravaLabel.setForeground(Color.red);
                spravaLabel.setText("nespravne heslo");
                pin.setText("");
            }
        }
        if(e.getSource() == resetButton)
        {
            pin.setText("");
        }
        
    }
    
}

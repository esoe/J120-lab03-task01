package main.java.ru.molokoin;


import java.awt.Container;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingFace extends JPanel {
    private Container cp;
    private JPanel NorthPane;
    private JPanel SouthPane;
    private JPanel CenterPane;
    
    public SwingFace(){
        
        init();
    }
    public JFrame initMainframe(){
        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 300, 600);
        frame.setTitle("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        return frame;
    }

    private void init() {
        
        
        
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        setVisible(true);
    }
    public JPanel  initNorthPane(){
        JPanel pan = new JPanel();

        return pan;
    }
}

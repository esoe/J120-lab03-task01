package main.java.ru.molokoin;

import javax.swing.JFrame;

public class SwingFace extends JFrame {
    public SwingFace(){
        init();
    }

    private void init() {
        setBounds(200, 200, 300, 600);
        setTitle("Калькулятор");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

package ru.molokoin.try02;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Runner{
    private JFrame jf;

    private JPanel north;
    private JTextField monitor;
    
    private JPanel center;
    private JButton oneBtn;
    private JButton twoBtn;
    private JButton threeBtn;
    private JButton fourBtn;
    private JButton fiveBtn;
    private JButton sixBtn;
    private JButton sevenBtn;
    private JButton eightBtn;
    private JButton nineBtn;
    private JButton zeroBtn;
    private JButton dotButton;// .
    private JButton clearButton;// c
    private JButton plusButton;// +
    private JButton minusButton;// -
    private JButton multiplexButton;// * 
    private JButton divideButton;// /
    
    private JPanel south;
    private JButton equalButton;// =
    
    public static void main(String[] args) {
        Runner c = new Runner();
        c.initControls();
        c.mainframe().add(c.north(), BorderLayout.NORTH);
        c.mainframe().add(c.center(), BorderLayout.CENTER);
        c.mainframe().add(c.south(), BorderLayout.SOUTH);
        c.mainframe().pack();
    }

    /**
     * Метод возвращает контейнер,
     * в котором будут располагаться элементы графического интерфейса
     * @return
     */
    private JFrame mainframe() {
        if (jf == null){
            jf = new JFrame();
            //настройка формы
            jf.setSize(200, 400);
            jf.setTitle("simple calculator");
            jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            jf.setLayout(new BorderLayout());
            jf.setVisible(true);
            return jf;
        }else {
            return jf;
        }
    }

    private JPanel north(){
        if (north == null){
            north = new JPanel();
            north.add(monitor());
            return north;
        }else{
            return north;
        }
    }

    private JTextField monitor(){
        if (monitor == null){
            monitor = new JTextField("", 25);
            return monitor;
        } else{
            return monitor;
        }
    }

    private JPanel center(){
        if (center == null){
            center = new JPanel();
            center.setLayout(new GridLayout(4, 4));
            center.add(sevenBtn);
            center.add(eightBtn);
            center.add(nineBtn);
            center.add(plusButton);
            center.add(fourBtn);
            center.add(fiveBtn);
            center.add(sixBtn);
            center.add(minusButton);
            center.add(oneBtn);
            center.add(twoBtn);
            center.add(threeBtn);
            center.add(multiplexButton);
            center.add(zeroBtn);
            center.add(dotButton);
            center.add(clearButton);
            center.add(divideButton);
            return center;
        }else{
            return center;
        }
    }
    private JPanel south(){
        if (south == null){
            south = new JPanel();
            south.setLayout(new BorderLayout());
            south.add(equalButton, BorderLayout.CENTER);
            return south;
        }else {
            return south;
        }
    }

    /**
     * Инициируем кнопки - компоненты управления приложением
     */
    private void initControls(){
        Calc calc = new Calc();
        oneBtn = new JButton("1");
        oneBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + oneBtn.getText());
            calc.input("1");
            monitor.setText(calc.input.toString());
        });
        twoBtn = new JButton("2");
        twoBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + twoBtn.getText());
            calc.input("2");
            monitor.setText(calc.input.toString());
        });
        threeBtn = new JButton("3");
        threeBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + threeBtn.getText());
            calc.input("3");
            monitor.setText(calc.input.toString());
        });
        fourBtn = new JButton("4");
        fourBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + fourBtn.getText());
            calc.input("4");
            monitor.setText(calc.input.toString());
        });
        fiveBtn = new JButton("5");
        fiveBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + fiveBtn.getText());
            calc.input("5");
            monitor.setText(calc.input.toString());
        });
        sixBtn = new JButton("6");
        sixBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + sixBtn.getText());
            calc.input("6");
            monitor.setText(calc.input.toString());
        });
        sevenBtn = new JButton("7");
        sevenBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + sevenBtn.getText());
            calc.input("7");
            monitor.setText(calc.input.toString());
        });
        eightBtn = new JButton("8");
        eightBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + eightBtn.getText());
            calc.input("8");
            monitor.setText(calc.input.toString());
        });
        nineBtn = new JButton("9");
        nineBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + nineBtn.getText());
            calc.input("9");
            monitor.setText(calc.input.toString());
        });
        zeroBtn = new JButton("0");
        zeroBtn.addActionListener(e -> {
            System.out.println("Pressed button: " + zeroBtn.getText());
            calc.input("0");
            monitor.setText(calc.input.toString());
        });
        clearButton = new JButton("c");
        clearButton.addActionListener(e -> {
            System.out.println("Pressed button: " + clearButton.getText());
            calc.input("c");
            monitor.setText(calc.input.toString());
        });
        dotButton = new JButton(".");
        dotButton.addActionListener(e -> {
            System.out.println("Pressed button: " + dotButton.getText());
            calc.input(".");
            monitor.setText(calc.input.toString());
        });
        plusButton = new JButton("+");
        plusButton.addActionListener(e -> {
            System.out.println("Pressed button: " + plusButton.getText());
            calc.input("+");
            monitor.setText(calc.input.toString());
        });
        minusButton = new JButton("-");
        minusButton.addActionListener(e -> {
            System.out.println("Pressed button: " + minusButton.getText());
            calc.input("-");
            monitor.setText(calc.input.toString());
        });
        multiplexButton = new JButton("*");
        multiplexButton.addActionListener(e -> {
            System.out.println("Pressed button: " + multiplexButton.getText());
            calc.input("*");
            monitor.setText(calc.input.toString());
        });
        divideButton = new JButton("/");
        divideButton.addActionListener(e -> {
            System.out.println("Pressed button: " + divideButton.getText());
            calc.input("/");
            monitor.setText(calc.input.toString());
        });
        equalButton = new JButton("=");
        equalButton.addActionListener(e -> {
            System.out.println("Pressed button: " + equalButton.getText());
            calc.input("=");
            monitor.setText(calc.memory.toString());
        });
    }

    private static class Calc{
        StringBuilder input;
        Double memory;
        String operation;
        
        public Calc(){
            clear();
        }

        public void clear(){
            input = new StringBuilder();
            memory = 0.0;
            operation = "";
        }

        /**
         * при клике на клавишу, вызывается метод input(),
         * который определяет что делать с введенным значением
         * @param s
         */
        public void input(String s){
            switch (s){
                case "+":
                    memory = Double.valueOf(input.toString());
                    operation = "+";
                    input = new StringBuilder();
                    break;
                case "-":
                    memory = Double.valueOf(input.toString());
                    operation = "-";
                    input = new StringBuilder();
                    break;
                case "*":
                    memory = Double.valueOf(input.toString());
                    operation = "*";
                    input = new StringBuilder();
                    break;
                case "/":
                    memory = Double.valueOf(input.toString());
                    operation = "/";
                    input = new StringBuilder();
                    break;
                case "=":
                    if (operation == "+"){
                        memory = memory + Double.valueOf(input.toString());
                        operation = "";
                        input = new StringBuilder();
                        break;
                    }
                    if (operation == "-"){
                        memory = memory - Double.valueOf(input.toString());
                        operation = "";
                        input = new StringBuilder();
                        break;
                    }
                    if (operation == "*"){
                        memory = memory * Double.valueOf(input.toString());
                        operation = "";
                        input = new StringBuilder();
                        break;
                    }
                    if (operation == "/"){
                        memory = memory / Double.valueOf(input.toString());
                        operation = "";
                        input = new StringBuilder();
                        break;
                    }
                    if (operation == ""){
                        break;
                    }
                    break;
                case "c":
                    clear();
                    break;
                default:
                    input.append(s);
            }
        }
    }
}
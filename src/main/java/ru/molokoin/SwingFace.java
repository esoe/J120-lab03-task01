package ru.molokoin;


import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingFace extends JFrame {
    private Calculate calculator;
    private Container mainpane;
    private JTextField field;
    private JPanel northpane;
    private JButton equalityBtn;
    private JPanel southpane;
    private JButton plusBtn;
    private JButton subtractBtn;
    private JButton multiplyBtn;
    private JButton divideBtn;
    private JButton dotBtn;
    private JButton clearBtn;
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
    private JPanel centerpane;
    SwingFace (Calculate calculator){
        this.calculator = calculator;
        initMainframe();
        initMainpane();
        pack();
    }
    private void initMainframe() {
        setSize(200, 400);
        setTitle("simple calculator");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    private void initMainpane() {
        mainpane = getContentPane();
        mainpane.setLayout(new BorderLayout());
        initNorthpane();
        mainpane.add(northpane, BorderLayout.NORTH);
        initSouthpane();
        mainpane.add(southpane, BorderLayout.SOUTH);
        initCenterpane();
        mainpane.add(centerpane, BorderLayout.CENTER);
    }
    /**
     * Центральная панель
     */
    private void initCenterpane() {
        /**
         * инициируем кнопки
         */
        plusBtn = new JButton("+");
        plusBtn.addActionListener(e -> {
            /**
             * обработка нажатия кнопки "+"
             */
            calculator.input("+");

        });
        subtractBtn = new JButton("-");
        multiplyBtn = new JButton("*");
        divideBtn = new JButton("/");
        dotBtn = new JButton(".");
        clearBtn = new JButton("C");
        oneBtn = new JButton("1");
        oneBtn.addActionListener(e ->{
            /**
             * обработка нажатия кнопки "1"
             * - добавляем в текстовое поле единичку
             */
            field.setText(field.getText() + "1");
        });
        twoBtn = new JButton("2");
        threeBtn = new JButton("3");
        fourBtn = new JButton("4");
        fiveBtn = new JButton("5");
        sixBtn = new JButton("6");
        sevenBtn = new JButton("7");
        eightBtn = new JButton("8");
        nineBtn = new JButton("9");
        zeroBtn = new JButton("0");
        
        //создание центральной панели
        centerpane = new JPanel();
        centerpane.setLayout(new GridLayout(0,4));

        //добавление кнопок
        centerpane.add(sevenBtn);
        centerpane.add(eightBtn);
        centerpane.add(nineBtn);
        centerpane.add(plusBtn);

        centerpane.add(fourBtn);
        centerpane.add(fiveBtn);
        centerpane.add(sixBtn);
        centerpane.add(subtractBtn);

        centerpane.add(oneBtn);
        centerpane.add(twoBtn);
        centerpane.add(threeBtn);
        centerpane.add(multiplyBtn);

        centerpane.add(zeroBtn);
        centerpane.add(dotBtn);
        centerpane.add(clearBtn);
        centerpane.add(divideBtn);
    }
    private void initSouthpane() {
        equalityBtn = new JButton("=");
        equalityBtn.addActionListener(e -> {
            //
        });
        southpane = new JPanel();
        southpane.setLayout(new BorderLayout());
        southpane.add(equalityBtn, BorderLayout.CENTER);

    }
    private void initNorthpane() {
        northpane = new JPanel();
        field = new JTextField(25);
        field.setText(calculator.input.toString());
        field.setEditable(false);
        northpane.setLayout(new BorderLayout());
        northpane.add(field, BorderLayout.CENTER);
    }
}

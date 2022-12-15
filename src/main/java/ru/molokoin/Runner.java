package ru.molokoin;

public class Runner {
    Calculate calculator;
    SwingFace mainframe;
    public Runner(){
        init();
    }
    public void init(){
        calculator = new Calculate();
        mainframe = new SwingFace(calculator);
    }

    public static void main(String[] args) {
        System.out.println("Программа калькулятор запущена и готова к использованию ...");
        new Runner();
    }
}
